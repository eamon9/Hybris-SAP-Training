package de.hybris.training.facades.product;

import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.training.facades.product.data.TrainingSkuData;

import java.util.List;

public interface MyProductVariantFacade {

    List<TrainingSkuData> getSkuData();
    //List getTrainingSkuData();
}
