package decorator;

// Базовый интерфейс отправки сообщений
public interface Notifier {
    void send(String clientName, String notification);
}
