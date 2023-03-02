package de.hybris.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.basecommerce.jalo.GeneratedBasecommerceManager;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.facades.product.MyProductVariantFacade;
import de.hybris.training.facades.product.data.TrainingSkuData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/lowstockproducts")
public class LowStockProductsController extends AbstractPageController
{

    //-----------------------------------------------------
    @Autowired
    MyProductVariantFacade myProductFacade;
    //------------------------------------------------------
    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @RequestMapping(method = RequestMethod.GET)
    public String showLowStockProducts(Model model)
    {

        String query = "SELECT {p.PK} FROM {Product AS p} WHERE" +
                " EXISTS ({{SELECT * FROM {StockLevel as s} WHERE" +
                " {s.productCode} = {p.code} AND {s.available} < '5' }})";

        FlexibleSearchQuery fsQuery = new FlexibleSearchQuery(query);

        SearchResult<ProductModel> result = flexibleSearchService.search(fsQuery);

        List<ProductModel> products = result.getResult();

        model.addAttribute("products", products);

        //model.addAttribute("listSize", products.size());


        //-------------------------------------------------------
        List<TrainingSkuData> skuDataList = myProductFacade.getSkuData();
        model.addAttribute("listSize", skuDataList.size());
        List<String> products1 = new ArrayList<String>();

        for (int i = 0; i < skuDataList.size(); i++) {
            TrainingSkuData skuData = skuDataList.get(i);
            products1.add("Product name: " + skuData.getName() + "\nStatus: " + skuData.getStatus());
            List<String> warehouseList = skuData.getWarehouses();
            for (int j = 0; j < warehouseList.size(); j++) {
                String warehouse = warehouseList.get(j);
                model.addAttribute("W_house ID: '" + warehouse + "'");
            }
        }

        //--------------------------------------------------------------


        return "pages/stockData/lowstockproducts";
    }

}
