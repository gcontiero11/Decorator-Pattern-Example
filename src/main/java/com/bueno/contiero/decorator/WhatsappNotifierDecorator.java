package com.bueno.contiero.decorator;

import com.bueno.contiero.interfaces.Notifier;
import com.bueno.contiero.services.WhatsappNotifierService;

public class WhatsappNotifierDecorator extends BaseNotifierDecorator {
    public WhatsappNotifierDecorator(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void notify(String message) {
        WhatsappNotifierService service = new WhatsappNotifierService();
        service.notify(message);
        wrappedNotifier.notify(message);
    }
}
