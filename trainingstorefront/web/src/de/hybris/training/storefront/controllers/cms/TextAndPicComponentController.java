package de.hybris.training.storefront.controllers.cms;

import de.hybris.training.core.model.TextAndPicComponentModel;
import de.hybris.training.storefront.controllers.ControllerConstants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller("TextAndPicComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.TextAndPicComponent)
public class TextAndPicComponentController extends AbstractAcceleratorCMSComponentController<TextAndPicComponentModel> {


    @Override
    protected void fillModel(final HttpServletRequest request, Model model, TextAndPicComponentModel component) {
        model.addAttribute("productName", component.getProductName());
        model.addAttribute("brand",component.getBrand());
        model.addAttribute("productImage",component.getProductImage());
    }

}
