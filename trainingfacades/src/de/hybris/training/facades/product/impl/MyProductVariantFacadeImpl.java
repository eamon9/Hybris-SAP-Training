package de.hybris.training.facades.product.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.training.core.product.MyProductService;
import de.hybris.training.facades.product.MyProductVariantFacade;
import de.hybris.training.facades.product.data.TrainingSkuData;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class MyProductVariantFacadeImpl implements MyProductVariantFacade {

    @Resource
    private MyProductService productService;

    @Override
    public List<TrainingSkuData> getSkuData() {
        List<ProductModel> productModelList = productService.getProducts();
        TrainingSkuData data = new TrainingSkuData();
        List<TrainingSkuData> dataList = new ArrayList<>();
        for (ProductModel productModel : productModelList) {
            data.setDescription(productModel.getCode());
            data.setName(productModel.getName());
            dataList.add(data);
        }
        return dataList;
    }

    public void setProductService(final MyProductService productService) {
        this.productService = productService;
    }

    /*@Override
    protected  MyProductService getProductService() {
        return productService;
    }

    @Override
    public List getTrainingSkuData() {
        return null;
    }*/
}
