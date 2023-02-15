package de.hybris.training.core.daos.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.training.core.daos.MyProductDao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultMyProductDao extends AbstractItemDao implements MyProductDao {

    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<ProductModel> getProducts() {

        final String queryString = "SELECT {p.PK} FROM {Product AS p}";

        /*final String queryString = //
                "SELECT {" + ProductModel.PK + "}, {" + ProductModel.CODE + "},{" + ProductModel.NAME + "[de]}" //
                        + "FROM {" + ProductModel._TYPECODE + "} ";*/
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        return flexibleSearchService.<ProductModel> search(query).getResult();
    }

    /*private static final Logger LOG = Logger.getLogger(DefaultMyProductDao.class);

    public DefaultMyProductDao(String typecode) {
        super(typecode);
    }

    @Override
    public List findTrainingSkuData(Product sku) {
        return null;
    }*/
}
