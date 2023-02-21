package de.hybris.training.core.daos;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.SearchResult;

public interface AbandonedCartEmailListResultDao {

    public SearchResult<CartModel> findProductsInCart();
}
