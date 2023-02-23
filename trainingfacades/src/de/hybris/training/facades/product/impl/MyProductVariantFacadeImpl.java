package de.hybris.training.facades.product.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.training.core.product.MyProductService;
import de.hybris.training.facades.converters.SkuConverter;
import de.hybris.training.facades.product.MyProductVariantFacade;
import de.hybris.training.facades.product.data.TrainingSkuData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyProductVariantFacadeImpl implements MyProductVariantFacade {

    private MyProductService productService;
    private SkuConverter converter;

    @Override
    public List<TrainingSkuData> getSkuData() {
        List<ProductModel> productModelList = productService.getProducts();
        /*TrainingSkuData data = new TrainingSkuData();
        List<TrainingSkuData> dataList = new ArrayList<>();
        for (int i = 0; i < productModelList.size(); i++) {
            ProductModel productModel = productModelList.get(i);
            data.setDescription(productModel.getDescription());
            data.setName(productModel.getName());
            data.setStatus(String.valueOf(productModel.getApprovalStatus()));
            data.setWarehouses(Collections.singletonList(productModel.getUnitOfMeasure()));
            dataList.add(data);
        }
        return dataList;*/
        return Converters.convertAll(productModelList, converter);
    }

    public void setProductService(final MyProductService productService) {
        this.productService = productService;
    }

    public void setConverter(final SkuConverter converter) {
        this.converter = converter;
    }
}
