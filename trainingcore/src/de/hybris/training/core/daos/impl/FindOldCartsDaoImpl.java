package de.hybris.training.core.daos.impl;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.daos.FindOldCartsDao;
import org.springframework.beans.factory.annotation.Autowired;

public class FindOldCartsDaoImpl implements FindOldCartsDao {

    private static final String HOUR = "hour";
    private static final String FILTER_TO_CREATION_TIME = " {cart.creationTime} > SYSDATE - INTERVAL '";
    private static final String CART_QUERY = "SELECT {cart.pk} from {CART as cart}";
    private static final String WHERE_CLAUSE = " WHERE ";


    @Autowired
    FlexibleSearchService flexibleSearchService;


    @Override
    public SearchResult<CartModel> findOldCarts(int hours) {

        final StringBuilder stringBuilder = new StringBuilder(CART_QUERY);
        stringBuilder.append(WHERE_CLAUSE);
        stringBuilder.append(FILTER_TO_CREATION_TIME);
        stringBuilder.append(hours);
        stringBuilder.append("' HOUR");

        final FlexibleSearchQuery query = new FlexibleSearchQuery(stringBuilder.toString());
        return flexibleSearchService.search(query);
    }
}
