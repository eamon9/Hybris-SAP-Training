package de.hybris.training.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.daos.UnapprovedProductListResultDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class UnapprovedProductListJobPerformable extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(UnapprovedProductListJobPerformable.class);

    @Autowired
    UnapprovedProductListResultDao unapprovedProductListResultDao;

    @Override
    public PerformResult perform(final CronJobModel cronJob) {

        final SearchResult<ProductModel> searchResult = unapprovedProductListResultDao.findUnapprovedProductsByStatus(); //findUnapprovedProductsByStatus()

        LOG.info("\n*** TEST FOR 'UnapprovedProductListJobPerformable' class *** c|-_-|c ***");
        searchResult.getResult().stream().forEach(this::printProducts);

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public void printProducts(final ProductModel productModel) {

        LOG.info("\nSKU CODE: " + productModel.getCode() +
                "\nCREATION TIME: " + productModel.getCreationtime() +
                "\nPRODUCT STATUS: " + productModel.getApprovalStatus());

        /*LOG.info("\nP. Code: " + productModel.getCode() + "\nP. Name: " + productModel.getName() +
                "\nP. Status: " + productModel.getApprovalStatus() + "\nP. Unit: " + productModel.getUnit() +
                "\nP. Description: " + productModel.getDescription() + " P. StockLevel: " + productModel.getStockLevels() +
                "\nP. CatalogVersion: " + productModel.getCatalogVersion() + " P. OrderLimit: " + productModel.getProductOrderLimit() +
                "\nP. CreationTime: " + productModel.getCreationtime() + " P. Supercategory: " + productModel.getSupercategories());*/
    }

}











































