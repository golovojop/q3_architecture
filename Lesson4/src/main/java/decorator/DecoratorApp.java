package decorator;

import decorator.decorators.SupportDecorator;
import decorator.decorators.AdvDecorator;
import decorator.decorators.GreetingDecorator;
import decorator.decorators.NotifierDecorator;

public class DecoratorApp {
    public static void main(String[] args) {

        NotifierDecorator nd = new GreetingDecorator(
                new AdvDecorator(
                        new SupportDecorator(
                                new SmsNotifier("9991234567")
                        )
                )
        );

        nd.send("Ivan", "Пора платить !");
    }
}
