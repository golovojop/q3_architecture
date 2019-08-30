package client;

import server.ChatServer;

import java.util.Random;

public class Client implements ChatClient {

    private String[] clientsOnline;
    private ChatServer server;
    private String name;

    public Client(String name, ChatServer server) {
        this.name = name;
        this.server = server;
        server.connect(this);
    }

    public void sendRandomly(String message) {
        server.sendMessage(message, getRecipient(), name);
    }

    @Override
    public String getId() {
        return name;
    }

    @Override
    public void updateChatList(String[] clients) {
        clientsOnline = clients;
    }

    @Override
    public void incomingMessage(String message, String from) {
        System.out.printf("%s получил сообщение от %s:\n\t'%s'\n", name, from, message);
    }

    // Определить получателя. Не отправлять сообщения себе
    private String getRecipient() {
        String recipient = name;

        do {
            recipient = clientsOnline[new Random().nextInt(clientsOnline.length)];
        } while (recipient.equals(name));

        return recipient;
    }
}
