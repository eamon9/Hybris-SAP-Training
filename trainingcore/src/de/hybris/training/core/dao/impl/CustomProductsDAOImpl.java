package de.hybris.training.core.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import de.hybris.training.core.dao.CustomProductsDAO;


public class CustomProductsDAOImpl implements CustomProductsDAO
{

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<ProductModel> findAllProductsOlderThanSpecifiedDays(final Date oldDate)
    {
        final StringBuilder query = new StringBuilder("SELECT {pk} FROM {Product} WHERE {creationtime}<=?oldDate");
        final Map<String, Object> params = new HashMap<String, Object>();
        params.put("oldDate", oldDate);

        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        searchQuery.addQueryParameters(params);
        searchQuery.setResultClassList(Collections.singletonList(ProductModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult();
    }


    public FlexibleSearchService getFlexibleSearchService()
    {
        return flexibleSearchService;
    }


    public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
    {
        this.flexibleSearchService = flexibleSearchService;
    }

}
