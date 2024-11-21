package com.bueno.contiero.notifier;

import com.bueno.contiero.interfaces.Notifier;
import com.bueno.contiero.services.SuapNotifierService;

public class SuapNotifierImp implements Notifier {
    @Override
    public void notify(String message) {
        SuapNotifierService service = new SuapNotifierService();
        service.notify(message);
    }
}
