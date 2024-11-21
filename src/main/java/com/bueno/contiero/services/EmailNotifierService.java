package com.bueno.contiero.services;

import com.bueno.contiero.interfaces.NotifierService;

public class EmailNotifierService implements NotifierService {
    @Override
    public void notify(String message) {
        System.out.println("Email notification: " + message);
    }
}
