package com.bueno.contiero.decorator;

import com.bueno.contiero.interfaces.Notifier;
import com.bueno.contiero.services.SuapNotifierService;

public class SuapNotifierDecorator extends BaseNotifierDecorator {
    public SuapNotifierDecorator(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void notify(String message) {
        SuapNotifierService service = new SuapNotifierService();
        service.notify(message);
        wrappedNotifier.notify(message);
    }
}
