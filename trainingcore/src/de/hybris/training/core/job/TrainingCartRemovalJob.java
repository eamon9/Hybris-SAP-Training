package de.hybris.training.core.job;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.daos.FindOldCartsDao;
import de.hybris.training.core.model.TrainingOldCartRemovalJobModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class TrainingCartRemovalJob extends AbstractJobPerformable<TrainingOldCartRemovalJobModel> {

    @Autowired
    FindOldCartsDao findOldCartsDao;

    private static final Logger LOG = Logger.getLogger(TrainingCartRemovalJob.class);


    @Override
    public PerformResult perform(TrainingOldCartRemovalJobModel trainingOldCartRemovalJobModel) {

        final SearchResult<CartModel> searchResult = findOldCartsDao.findOldCarts(trainingOldCartRemovalJobModel.getHours());

        LOG.info("Found " + searchResult.getCount() + " carts in the last " + trainingOldCartRemovalJobModel.getHours() + " Hours");
        searchResult.getResult().stream().forEach(this::removeOldCarts);
        LOG.info("Removed " + searchResult.getCount() + " carts");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    private void removeOldCarts(CartModel cartModel) {
        LOG.info("Removing carts");
        modelService.remove(cartModel);
    }

    /*
    SELECT {c.pk} from {Cart as c} where {c.creationTime} > SYSDATE - INTERVAL '1' HOUR
    */
}
