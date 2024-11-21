package com.bueno.contiero.services;

import com.bueno.contiero.interfaces.NotifierService;

public class SuapNotifierService implements NotifierService {
    @Override
    public void notify(String message) {
        System.out.println("Suap notification: " + message);
    }
}
