package de.hybris.training.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.daos.AbandonedCartEmailListResultDao;
import de.hybris.training.core.daos.ProductListResultDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class AbandonedCartEmailJobPerformable extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(AbandonedCartEmailJobPerformable.class);

    @Autowired
    AbandonedCartEmailListResultDao abandonedCartEmailListResultDao;

    @Override
    public PerformResult perform(final CronJobModel cronJob) {

        final SearchResult<ProductModel> searchResult = abandonedCartEmailListResultDao.findProductsInCart();

        //LOG.info("\n*** Send email to Customer with products in Cart ***");
        LOG.info("\n*** Print products in Cart ***");
        // with FlexSearch prints all requirements from printProductCodes method down below
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
