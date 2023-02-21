package de.hybris.training.core.service.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.training.core.dao.TestOrderDAO;
import de.hybris.training.core.service.TestOrderService;

import javax.annotation.Resource;
import java.util.List;

public class TestOrderServiceImpl implements TestOrderService {

    @Resource
    private TestOrderDAO testOrderDAO;
    @Override
    public List<OrderModel> getOrderDetails() {
        return testOrderDAO.getOrderDetails();
    }
}
