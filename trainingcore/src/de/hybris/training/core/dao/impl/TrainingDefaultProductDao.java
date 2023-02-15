package de.hybris.training.core.dao.impl;

import de.hybris.training.core.dao.TrainingProductDao;
import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.acceleratorservices.dataexport.googlelocal.model.Product;

import java.util.List;

public class TrainingDefaultProductDao extends DefaultProductDao implements TrainingProductDao {

    public TrainingDefaultProductDao(String typecode) {
        super(typecode);
    }

    @Override
    public List findTrainingSkuData(Product sku) {
        return  null;
    }
}
