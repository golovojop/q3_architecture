package decorator.decorators;

import decorator.Notifier;

// Базовый декоратор
public class NotifierDecorator implements Notifier {

    private Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String clientName, String notification) {
        wrappee.send(clientName, notification);
    }
}
