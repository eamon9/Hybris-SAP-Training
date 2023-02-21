package de.hybris.training.core.daos.impl;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.daos.AbandonedCartEmailListResultDao;
import de.hybris.training.core.daos.ProductListResultDao;

public class AbandonedCartEmailListResultsDaoImpl extends DefaultProductDao implements AbandonedCartEmailListResultDao {

    public AbandonedCartEmailListResultsDaoImpl(String typecode) {

        super(typecode);
    }

    @Override
    public SearchResult<CartModel> findProductsInCart() {

        final String string = "SELECT {PK} FROM { Cart as c} WHERE {c.creationtime} < SYSDATE - INTERVAL '1' HOUR";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(string);


        return getFlexibleSearchService().search(query);
    }
}
