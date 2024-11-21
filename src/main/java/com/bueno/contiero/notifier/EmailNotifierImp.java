package com.bueno.contiero.notifier;

import com.bueno.contiero.interfaces.Notifier;
import com.bueno.contiero.services.EmailNotifierService;

public class EmailNotifierImp implements Notifier {
    @Override
    public void notify(String message) {
        EmailNotifierService service = new EmailNotifierService();
        service.notify(message);
    }
}
