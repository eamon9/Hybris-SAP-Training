package de.hybris.training.core.event;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.training.core.model.custom.TrainingEmailProcessModel;
import org.springframework.beans.factory.annotation.Required;

public class TrainingEmailEventListener extends AbstractAcceleratorSiteEventListener<TrainingEmailEvent> {

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
    protected void onSiteEvent(final TrainingEmailEvent event) {

        final TrainingEmailProcessModel trainingEmailProcessModel = (TrainingEmailProcessModel) getBusinessProcessService().createProcess("trainingEmail-" + event.getCart().getCode() + "-" + processCodeGenerator.generate().toString(), "trainingEmailProcess");
        trainingEmailProcessModel.setCart(event.getCart());
        trainingEmailProcessModel.setCurrency(event.getCurrency());
        trainingEmailProcessModel.setStore(event.getBaseStore());
        trainingEmailProcessModel.setSite(event.getSite());
        trainingEmailProcessModel.setLanguage(event.getLanguage());
        getModelService().save(trainingEmailProcessModel);
        getBusinessProcessService().startProcess(trainingEmailProcessModel);
    }

    public KeyGenerator getProcessCodeGenerator() {

        return processCodeGenerator;
    }

    public void setProcessCodeGenerator(KeyGenerator processCodeGenerator) {

        this.processCodeGenerator = processCodeGenerator;
    }

    @Override
    protected SiteChannel getSiteChannelForEvent(TrainingEmailEvent event) {
        return null;
    }
}
