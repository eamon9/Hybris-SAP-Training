package de.hybris.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
@RequestMapping(value = "/lowstockproducts")
public class LowStockProductsController extends AbstractPageController
{

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

        return "pages/stockData/lowstockproducts";
    }

}
