package de.hybris.training.core.dao.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.TestOrderDAO;

import javax.annotation.Resource;
import java.util.List;

public class TestOrderDAOImpl implements TestOrderDAO {

    private static final String FETCH_ALL_ORDERS = new StringBuilder("SELECT {").append(OrderModel.PK).append("} FROM {")
            .append(OrderModel._TYPECODE).append("}").toString();
    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<OrderModel> getOrderDetails() {
        final FlexibleSearchQuery query = new FlexibleSearchQuery(FETCH_ALL_ORDERS);
        final SearchResult<OrderModel> result = flexibleSearchService.search(query);
        return  result.getResult();
    }
}
