package de.hybris.training.core.daos;

import de.hybris.platform.product.daos.ProductDao;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.acceleratorservices.dataexport.googlelocal.model.Product;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface MyProductDao extends Dao {

    List<ProductModel> getProducts();

    //List findTrainingSkuData(Product sku);
}
