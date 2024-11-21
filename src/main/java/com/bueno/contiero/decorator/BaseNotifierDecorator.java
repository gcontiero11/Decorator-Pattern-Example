package com.bueno.contiero.decorator;

import com.bueno.contiero.interfaces.Notifier;

public abstract class BaseNotifierDecorator implements Notifier {
    Notifier wrappedNotifier;

    public BaseNotifierDecorator(Notifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
    }

    @Override
    public abstract void notify(String message);

}
