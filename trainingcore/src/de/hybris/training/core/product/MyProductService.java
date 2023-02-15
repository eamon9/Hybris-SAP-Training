package de.hybris.training.core.product;

import de.hybris.platform.acceleratorservices.dataexport.googlelocal.model.Product;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;

import java.util.List;

public interface MyProductService {

    List<ProductModel> getProducts();

    //List gettrainingSkuData(Product sku);
}
