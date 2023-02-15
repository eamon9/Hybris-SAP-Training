package de.hybris.training.storefront.controllers;

import de.hybris.training.facades.product.MyProductVariantFacade;
import de.hybris.training.facades.product.data.TrainingSkuData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TrainingStockController {
    @Autowired
    MyProductVariantFacade myProductFacade;

    @RequestMapping(value = "/lowStockSKU")
    public String showSKUCode(final Model model) {

        List<TrainingSkuData> dataList = myProductFacade.getSkuData();
        model.addAttribute("SKU", dataList.size());
        List<String> products = new ArrayList<String>();
        for(TrainingSkuData data: dataList) {
            products.add(data.getDescription() + ":" + data.getName());
        }
        model.addAttribute("products", products);
        return "pages/stockData/lowStockSKU";
    }
}