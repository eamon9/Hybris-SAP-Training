package de.hybris.training.storefront.controllers;

import de.hybris.training.core.daos.impl.DefaultMyProductDao;
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

    //DefaultMyProductDao myProductDao;

    @RequestMapping(value = "/lowStockSKU")
    public String showSKUCode(final Model model) {
        //model.addAttribute("product_pcs", myProductDao.PRODUCT_PCS);

        List<TrainingSkuData> skuDataList = myProductFacade.getSkuData();
        model.addAttribute("listSize", skuDataList.size());
        List<String> products = new ArrayList<String>();
        for (int i = 0; i < skuDataList.size(); i++) {
            TrainingSkuData skuData = skuDataList.get(i);
            products.add("Product name: " + skuData.getName() + "\nStatus: " + skuData.getStatus());
            List<String> warehouseList = skuData.getWarehouses();
            for (int j = 0; j < warehouseList.size(); j++) {
                String warehouse = warehouseList.get(j);
                products.add("W_house ID: '" + warehouse + "'");
            }
        }
        model.addAttribute("products", products);
        return "pages/stockData/lowStockSKU";
    }
}