package de.hybris.training.core.daos;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.SearchResult;

public interface AbandonedCartEmailListResultDao {

    public SearchResult<ProductModel> findProductsInCart();
}
