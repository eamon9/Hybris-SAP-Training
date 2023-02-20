package de.hybris.training.core.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.store.BaseStoreModel;

public class AbandonedCartEmailEvent extends AbstractCommerceUserEvent {

    private AbstractOrderModel cart;

    public AbandonedCartEmailEvent(final AbstractOrderModel cart, final BaseStoreModel baseStore,
                                   final BaseSiteModel site, final CurrencyModel currency) {

        this.cart = cart;
        setBaseStore(baseStore);
        setSite(site);
        setCurrency(currency);
        setLanguage(cart.getUser().getSessionLanguage());
    }

    public AbstractOrderModel getCart() {

        return cart;
    }

    public void setCart(AbstractOrderModel cart) {

        this.cart = cart;
    }
}
