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

        //final String string = "SELECT {p.PK} FROM {Product AS p}";

        final String string = "SELECT {p.PK} FROM {Product AS p} WHERE" +
                " EXISTS ({{SELECT * FROM {StockLevel as s} WHERE" +
                " {s.productCode} = {p.code} AND {s.available} < '5' }})";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(string);
        return flexibleSearchService.<ProductModel> search(query).getResult();
    }
}
