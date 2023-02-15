package de.hybris.training.facades.product;

import de.hybris.platform.commercefacades.product.ProductFacade;

import java.util.List;

public interface TrainingProductVariantFacade extends ProductFacade {

    List getTrainingSkuData();
}
