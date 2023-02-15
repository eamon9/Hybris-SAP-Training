package de.hybris.training.core.service.impl;

import de.hybris.platform.acceleratorservices.dataexport.googlelocal.model.Product;
import de.hybris.platform.product.impl.DefaultProductService;
import de.hybris.training.core.dao.TrainingProductDao;
import de.hybris.training.core.service.TrainingProductService;

import java.util.List;

public class TrainingProductServiceImpl extends DefaultProductService implements TrainingProductService {

    private TrainingProductDao productDao;

    @Override
    protected TrainingProductDao getProductDao() {
        return productDao;
    }

    @Override
    public List getTrainingSkuData(Product sku) {
        return getProductDao().findTrainingSkuData(sku);
    }
}
