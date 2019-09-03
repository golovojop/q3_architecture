package server;

import client.ChatClient;

/**
 * Интерфейс для клиентов
 */

public interface Mediator {
    void connect(ChatClient chatClient);
    void disconnect(ChatClient chatClient);
    void sendMessage(String message, String to, String from);
}
