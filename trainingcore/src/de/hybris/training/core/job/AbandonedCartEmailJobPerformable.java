package de.hybris.training.core.job;

import de.hybris.platform.core.model.order.CartModel;
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

        final SearchResult<CartModel> searchResult = abandonedCartEmailListResultDao.findProductsInCart();

        //LOG.info("\n*** Send email to Customer with products in Cart ***");
        LOG.info("\n*** Print products in Cart ***");
        // with FlexSearch prints all requirements from printProductCodes method down below
        searchResult.getResult().stream().forEach(this::printProductCodes);

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    protected void printProductCodes(final CartModel cartModel) {

        LOG.info("\nP. Code: " + cartModel.getCode() + "\nP. Name: " + cartModel.getName() +
                "\nP. Store: " + cartModel.getStore() + "\nP. Unit: " + cartModel.getUnit() +
                "\nP. TotalPrice: " + cartModel.getTotalPrice() + "\nP. CreationTime: " + cartModel.getCreationtime() +
                "\nP. Currency: " + cartModel.getCurrency() + "\nP. SessionID: " + cartModel.getSessionId() +
                "\nP. Owner: " + cartModel.getOwner() + "\nP. User: " + cartModel.getUser() +
                "\nP. CreationTime: " + cartModel.getCreationtime() + "\nP. Description: " + cartModel.getDescription());
    }
}
