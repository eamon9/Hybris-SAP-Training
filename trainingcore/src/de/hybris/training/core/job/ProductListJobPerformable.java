package de.hybris.training.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.daos.ProductListResultDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductListJobPerformable extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(ProductListJobPerformable.class);

    @Autowired
    ProductListResultDao productListResultDao;

    @Override
    public PerformResult perform(final CronJobModel cronJob) {

        final SearchResult<ProductModel> searchResult = productListResultDao.findProductsByFirstLetter();

        LOG.info("\n*** Printing products with available details starting with P_CODE: 30001 ***");
        searchResult.getResult().stream().forEach(this::printProductCodes);

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    protected void printProductCodes(final ProductModel productModel) {

        LOG.info("\nP. Code: " + productModel.getCode() + "\nP. Name: " + productModel.getName() +
                "\nP. Status: " + productModel.getApprovalStatus() + "\nP. Unit: " + productModel.getUnit() +
                "\nP. Supercategory: " + productModel.getSupercategories() + "\nP. StockLevel: " + productModel.getStockLevels() +
                "\nP. UnitOfMeasure: " + productModel.getUnitOfMeasure() + "\nP. XML_Content: " + productModel.getXmlcontent() +
                "\nP. CatalogVersion: " + productModel.getCatalogVersion() + "\nP. OrderLimit: " + productModel.getProductOrderLimit() +
                "\nP. CreationTime: " + productModel.getCreationtime() + "\nP. Description: " + productModel.getDescription());
    }
}
