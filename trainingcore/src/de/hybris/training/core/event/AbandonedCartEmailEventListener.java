package de.hybris.training.core.event;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.training.core.model.custom.AbandonedEmailProcessModel;
import org.springframework.beans.factory.annotation.Required;

public class AbandonedCartEmailEventListener extends AbstractAcceleratorSiteEventListener<AbandonedCartEmailEvent> {

    private ModelService modelService;
    private BusinessProcessService businessProcessService;

    private KeyGenerator processCodeGenerator;

    protected BusinessProcessService getBusinessProcessService() {

        return businessProcessService;
    }

    @Required
    public void setBusinessProcessService(final BusinessProcessService businessProcessService) {

        this.businessProcessService = businessProcessService;
    }

    protected ModelService getModelService() {

        return modelService;
    }

    @Required
    public void setModelService(final ModelService modelService) {

        this.modelService = modelService;
    }

    @Override
    protected void onSiteEvent(final AbandonedCartEmailEvent event) {

        final AbandonedEmailProcessModel abandonedEmailProcessModel = (AbandonedEmailProcessModel) getBusinessProcessService().createProcess("abandonedCartEmail-" + event.getCart().getCode() + "-" + processCodeGenerator.generate().toString(), "abandonedCartEmailProcess");
        abandonedEmailProcessModel.setCart(event.getCart());
        abandonedEmailProcessModel.setCurrency(event.getCurrency());
        abandonedEmailProcessModel.setStore(event.getBaseStore());
        abandonedEmailProcessModel.setSite(event.getSite());
        abandonedEmailProcessModel.setLanguage(event.getLanguage());
        getModelService().save(abandonedEmailProcessModel);
        getBusinessProcessService().startProcess(abandonedEmailProcessModel);
    }

    public KeyGenerator getProcessCodeGenerator() {

        return processCodeGenerator;
    }

    public void setProcessCodeGenerator(KeyGenerator processCodeGenerator) {

        this.processCodeGenerator = processCodeGenerator;
    }

    @Override
    protected SiteChannel getSiteChannelForEvent(AbandonedCartEmailEvent event) {
        return null;
    }
}
