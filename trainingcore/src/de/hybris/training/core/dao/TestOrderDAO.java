package de.hybris.training.core.dao;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.List;

public interface TestOrderDAO {

    public List<OrderModel> getOrderDetails();
}
