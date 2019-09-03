package server;

import client.ChatClient;

import java.util.HashMap;

public class ChatServer implements Mediator {

    HashMap<String, ChatClient> chatClients = new HashMap<>();


    @Override
    public void connect(ChatClient chatClient) {
        chatClients.put(chatClient.getId(), chatClient);
        notifyClients();
    }

    @Override
    public void disconnect(ChatClient chatClient) {
        chatClients.remove(chatClient.getId());
        notifyClients();
    }

    @Override
    public void sendMessage(String message, String to, String from) {
        ChatClient receiver = chatClients.get(to);

        if(receiver != null) {
            receiver.incomingMessage(message, from);
        } else {
            System.out.println("Неизвестный получатель");
        }

    }

    // Обновить список online-клиентов у участников чата
    private void notifyClients() {
        String[] clients = chatClients.keySet().stream().toArray(String[]::new);

        for(ChatClient client : chatClients.values()) {
            client.updateChatList(clients);
        }
    }
}
