package de.hybris.training.core.service;

import de.hybris.platform.acceleratorservices.dataexport.googlelocal.model.Product;
import de.hybris.platform.product.ProductService;

import java.util.List;

public interface TrainingProductService extends ProductService {

    List getTrainingSkuData(Product sku);
}
