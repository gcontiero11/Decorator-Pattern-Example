package com.bueno.contiero;

import com.bueno.contiero.decorator.EmailNotifierDecorator;
import com.bueno.contiero.decorator.SuapNotifierDecorator;
import com.bueno.contiero.decorator.WhatsappNotifierDecorator;
import com.bueno.contiero.interfaces.Notifier;
import com.bueno.contiero.notifier.EmailNotifierImp;
import com.bueno.contiero.notifier.SuapNotifierImp;
import com.bueno.contiero.notifier.WhatsappNotifierImp;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new WhatsappNotifierDecorator(new SuapNotifierImp());
        notifier.notify("Chegou seu pedido");

        System.out.println();
        System.out.println("==============================//===========================");
        System.out.println();

        notifier = new WhatsappNotifierDecorator(new SuapNotifierDecorator(new EmailNotifierImp()));
        notifier.notify("Chegou seu pedido");

        System.out.println();
        System.out.println("==============================//==============================");
        System.out.println();

        notifier = new SuapNotifierImp();
        notifier.notify("Chegou seu pedido");

        System.out.println();
        System.out.println("==============================//==============================");
        System.out.println();

        notifier = new SuapNotifierDecorator(new EmailNotifierDecorator(new WhatsappNotifierImp()));
        notifier.notify("Chegou seu pedido");
    }
}