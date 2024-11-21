package com.bueno.contiero.notifier;

import com.bueno.contiero.interfaces.Notifier;
import com.bueno.contiero.services.WhatsappNotifierService;

public class WhatsappNotifierImp implements Notifier {
    @Override
    public void notify(String message) {
        WhatsappNotifierService service = new WhatsappNotifierService();
        service.notify(message);
    }
}
