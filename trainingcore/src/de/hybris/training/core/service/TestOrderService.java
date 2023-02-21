package de.hybris.training.core.service;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.List;

public interface TestOrderService {
    public List<OrderModel> getOrderDetails();
}
