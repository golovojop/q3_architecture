package decorator;

// Отправитель SMS
public class SmsNotifier implements Notifier {

    private final String number;

    public SmsNotifier(String number) {
        this.number = number;
    }

    @Override
    public void send(String clientName, String notification) {

        System.out.println("Sent to " + number + "\n");
        System.out.println(clientName + "\n" + notification);
    }
}
