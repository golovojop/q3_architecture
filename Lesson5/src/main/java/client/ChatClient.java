package client;

/**
 * Клиентк может:
 * - принимать сообщения
 * - получать список активных клиентов
 * - возвращать свой ID
 */

public interface ChatClient {
    void incomingMessage(String message, String from);
    void updateChatList(String[] clients);
    String getId();
}
