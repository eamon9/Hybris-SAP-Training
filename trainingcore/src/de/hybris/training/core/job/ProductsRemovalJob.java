package de.hybris.training.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.ProductsRemovalCronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.exceptions.ModelRemovalException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfigService;
import de.hybris.platform.solrfacetsearch.config.exceptions.FacetConfigServiceException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerService;
import de.hybris.platform.solrfacetsearch.indexer.exceptions.IndexerException;
import de.hybris.platform.solrfacetsearch.model.config.SolrFacetSearchConfigModel;
import de.hybris.platform.tx.Transaction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;
import de.hybris.training.core.dao.CustomProductsDAO;

public class ProductsRemovalJob extends AbstractJobPerformable<ProductsRemovalCronJobModel>
{
    public static final String SITE_UID = "apparel-uk";
    private CustomProductsDAO customProductsDao;
    private ModelService modelService;
    private IndexerService indexerService;
    private FacetSearchConfigService facetSearchConfigService;
    private BaseSiteService baseSiteService;

    private final static Logger LOG = Logger.getLogger(ProductsRemovalJob.class.getName());

    @Override
    public PerformResult perform(final ProductsRemovalCronJobModel productsRemovalCronJobModel)
    {
        final int noOfDaysOldToRemove = productsRemovalCronJobModel.getXDaysOld();
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -noOfDaysOldToRemove);
        final Date oldDate = cal.getTime();
        final List<ProductModel> productModelListToBeDeleted = new ArrayList<>();
        final List<ProductModel> productModelList = customProductsDao.findAllProductsOlderThanSpecifiedDays(oldDate);
        LOG.debug("Products older than specified days size:" + productModelList.size());
        for (final ProductModel productModel : productModelList)
        {
            if (CollectionUtils.isEmpty(productModel.getEurope1Prices()))
            {
                productModelListToBeDeleted.add(productModel);
            }
        }

        if (!CollectionUtils.isEmpty(productModelListToBeDeleted))
        {
            Transaction tx = null;
            try
            {
                tx = Transaction.current();
                tx.begin();
                getModelService().removeAll(productModelListToBeDeleted);
                tx.commit();
            }
            catch (final ModelRemovalException e)
            {
                if (null != tx)
                {
                    tx.rollback();
                }
                LOG.error("Could not remove the product list -->" + e);
            }
        }

        try
        {
            final SolrFacetSearchConfigModel facetSearchConfigModel = baseSiteService.getBaseSiteForUID(SITE_UID)
                    .getSolrFacetSearchConfiguration();
            final FacetSearchConfig facetSearchConfig = facetSearchConfigService.getConfiguration(facetSearchConfigModel.getName());
            indexerService.performFullIndex(facetSearchConfig);
        }
        catch (final FacetConfigServiceException | IndexerException e)
        {
            LOG.error("Could not index the products -->" + e);
        }

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public CustomProductsDAO getCustomProductsDao()
    {
        return customProductsDao;
    }

    public void setCustomProductsDao(final CustomProductsDAO customProductsDao)
    {
        this.customProductsDao = customProductsDao;
    }

    public ModelService getModelService()
    {
        return modelService;
    }

    @Override
    public void setModelService(final ModelService modelService)
    {

        this.modelService = modelService;
    }


    public IndexerService getIndexerService()
    {
        return indexerService;
    }


    public void setIndexerService(final IndexerService indexerService)
    {
        this.indexerService = indexerService;
    }


    public FacetSearchConfigService getFacetSearchConfigService()
    {
        return facetSearchConfigService;
    }


    public void setFacetSearchConfigService(final FacetSearchConfigService facetSearchConfigService)
    {
        this.facetSearchConfigService = facetSearchConfigService;
    }

    public BaseSiteService getBaseSiteService()
    {
        return baseSiteService;
    }

    public void setBaseSiteService(final BaseSiteService baseSiteService)
    {
        this.baseSiteService = baseSiteService;
    }

}
