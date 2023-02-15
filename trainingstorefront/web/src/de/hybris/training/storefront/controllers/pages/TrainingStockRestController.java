package de.hybris.training.storefront.controllers.pages;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.training.core.product.MyProductService;
import de.hybris.training.facades.product.MyProductVariantFacade;
import de.hybris.training.facades.product.data.TrainingSkuData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainingStockRestController {

    private static final Logger LOG = Logger.getLogger(TrainingStockRestController.class);
    @Autowired
    MyProductService productService;
    @Autowired
    MyProductVariantFacade myProductFacade;

    @RequestMapping(value = "/skuService")
    public List<ProductModel> showModel()
    {
        return productService.getProducts();
    }
    @RequestMapping(value = "/skuFacade")
    public List<TrainingSkuData> showFacade()
    {
        return myProductFacade.getSkuData();
    }
}
