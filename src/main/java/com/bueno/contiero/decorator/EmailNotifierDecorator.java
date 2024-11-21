package com.bueno.contiero.decorator;

import com.bueno.contiero.interfaces.Notifier;
import com.bueno.contiero.services.EmailNotifierService;

public class EmailNotifierDecorator extends BaseNotifierDecorator {

    public EmailNotifierDecorator(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void notify(String message) {
        EmailNotifierService service = new EmailNotifierService();
        service.notify(message);
        wrappedNotifier.notify(message);
    }
}
