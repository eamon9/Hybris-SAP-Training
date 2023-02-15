package de.hybris.training.facades.product.impl;

import de.hybris.platform.commercefacades.product.impl.DefaultProductVariantFacade;
import de.hybris.training.core.service.TrainingProductService;
import de.hybris.training.facades.product.TrainingProductVariantFacade;

import javax.annotation.Resource;
import  java.util.List;

public class TrainingProductVariantFacadeImpl extends DefaultProductVariantFacade implements TrainingProductVariantFacade {

    @Resource
    private TrainingProductService productService;

    @Override
    protected  TrainingProductService getProductService() {
        return productService;
    }

    @Override
    public List getTrainingSkuData() {
        return null;
    }
}
