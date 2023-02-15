package de.hybris.training.core.daos.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.daos.UnapprovedProductListResultDao;

public class UnapprovedProductListResultDaoImpl extends DefaultProductDao implements UnapprovedProductListResultDao {


    public UnapprovedProductListResultDaoImpl(String typecode) {

        super(typecode);
    }

    @Override
    public SearchResult<ProductModel> findUnapprovedProductsByStatus() {

        // Write a cron job which find all the unapproved product list ,
        // log them with sku code, creation time and product status
        // and also setup this job to run every day at 10.00 AM.
        /*
        final String query = "SELECT {product.PK} FROM {product join catalog on {product:catalog} = {catalog:pk}\n" +
                "join ArticleApprovalStatus on {product:approvalstatus} = {ArticleApprovalStatus:pk}}\n" +
                "where {catalog:id} = 'electronicsProductCatalog' and {ArticleApprovalStatus:code} = 'unapproved'";
        */

        final String query = "select {p.PK} from {product as p join catalog on {p:catalog} = {catalog:pk}\n" +
                "join ArticleApprovalStatus as AAS on {p:approvalstatus} = {AAS:pk}}\n" +
                "where {catalog:id} = 'electronicsProductCatalog' and {AAS:code} = 'unapproved'";

        return getFlexibleSearchService().search(new FlexibleSearchQuery(query));
    }
}
