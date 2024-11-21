package com.bueno.contiero.interfaces;

import java.time.LocalDate;

public interface Notifier {
    void notify(String message);

    default LocalDate notificationDate() {
        return LocalDate.now();
    }
}
