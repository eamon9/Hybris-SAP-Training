package de.hybris.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;
import java.util.Date;
import java.util.List;

public interface CustomProductsDAO {
    public List<ProductModel> findAllProductsOlderThanSpecifiedDays(final Date oldDate);
}
