package de.hybris.training.storefront.controllers.cms;

import de.hybris.training.core.model.TAPComponentModel;
import de.hybris.training.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller("TAPComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.TAPComponent)
public class TAPComponentController extends AbstractAcceleratorCMSComponentController<TAPComponentModel> {


    @Override
    protected void fillModel(final HttpServletRequest request, Model model, final TAPComponentModel component) {
        model.addAttribute("productName", component.getProductName());
        model.addAttribute("brandName",component.getBrandName());
        model.addAttribute("productImage",component.getProductImage());
    }

}
