package decorator.decorators;

import decorator.Notifier;

public class GreetingDecorator extends NotifierDecorator {
    public GreetingDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String clientName, String notification) {
        super.send(greeting(clientName), notification);
    }

    private String greeting(String clientName) {
        return "Dear " + clientName + " !";
    }
}
