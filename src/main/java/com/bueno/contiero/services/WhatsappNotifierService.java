package com.bueno.contiero.services;

import com.bueno.contiero.interfaces.NotifierService;

public class WhatsappNotifierService implements NotifierService {
    @Override
    public void notify(String message) {
        System.out.println("Whatsapp notification: " + message);
    }
}
