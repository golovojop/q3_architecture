package decorator.decorators;

import decorator.Notifier;
import decorator.decorators.NotifierDecorator;

public class SupportDecorator extends NotifierDecorator {
    public SupportDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String clientName, String notification) {
        super.send(clientName, addSupportInfo(notification));
    }

    private String addSupportInfo(String message) {
        return message + "\nYour Support Team";
    }
}
