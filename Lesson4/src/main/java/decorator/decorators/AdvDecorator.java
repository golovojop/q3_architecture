package decorator.decorators;

import decorator.Notifier;

public class AdvDecorator extends NotifierDecorator {
    public AdvDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String clientName, String notification) {
        super.send(clientName, addAdv(notification));
    }

    private String addAdv(String message) {
        return message + "\nPlay and win on www.play.org";
    }
}
