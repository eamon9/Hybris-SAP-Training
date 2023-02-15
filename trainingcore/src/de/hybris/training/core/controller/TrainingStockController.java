package de.hybris.training.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TrainingStockController {
    @RequestMapping("/lowStockSKU")
    @ResponseBody

    public String lowStockSku() {
        return "SKU status for every SKU";
    }
}
