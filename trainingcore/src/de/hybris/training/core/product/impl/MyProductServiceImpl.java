package de.hybris.training.core.product.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.training.core.daos.MyProductDao;
import de.hybris.training.core.product.MyProductService;

import java.util.List;

public class MyProductServiceImpl implements MyProductService {

    private MyProductDao productDao;


    @Override
    public List<ProductModel> getProducts() {
        return productDao.getProducts();
    }

    public void setProductDao(final MyProductDao productDao) {
        this.productDao = productDao;
    }

}
