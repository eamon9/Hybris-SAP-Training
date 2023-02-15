package de.hybris.training.core.daos.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.daos.ProductListResultDao;

public class ProductListResultsDaoImpl extends DefaultProductDao implements ProductListResultDao {

    public ProductListResultsDaoImpl(String typecode) {

        super(typecode);
    }

    @Override
    public SearchResult<ProductModel> findProductsByFirstLetter() {

        /*final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT {p:").append(ProductModel.PK).append("} ");
        stringBuilder.append("FROM {").append(ProductModel._TYPECODE).append(" AS p ").append("} ");
        stringBuilder.append("WHERE ").append("{p.code} Like '1%'" );

        final FlexibleSearchQuery query = new FlexibleSearchQuery(stringBuilder.toString());*/

        //final String string = "SELECT {p:PK} FROM {Product AS p} WHERE {p.code} Like '1%'";

        /*final String string = "SELECT * FROM {product join catalog on {product:catalog} = {catalog:pk}\n" +
                "join ArticleApprovalStatus on {product:approvalstatus} = {ArticleApprovalStatus:pk}}\n" +
                "where {catalog:id} = 'electronicsProductCatalog' and {ArticleApprovalStatus:code} = 'unapproved'";*/

        //final String string = "SELECT {p:PK} FROM {Product AS p} WHERE {p.code} Like '1%'";

        final String string = "SELECT {p.PK} FROM {Product AS p} WHERE {p.code} like '30001%'";

        final FlexibleSearchQuery query = new FlexibleSearchQuery(string);


        return getFlexibleSearchService().search(query);
    }
}
