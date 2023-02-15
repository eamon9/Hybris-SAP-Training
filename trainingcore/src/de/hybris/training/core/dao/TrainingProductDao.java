package de.hybris.training.core.dao;

import de.hybris.platform.acceleratorservices.dataexport.googlelocal.model.Product;
import de.hybris.platform.product.daos.ProductDao;

import java.util.List;

public interface TrainingProductDao extends ProductDao {
    List findTrainingSkuData(Product sku);
}