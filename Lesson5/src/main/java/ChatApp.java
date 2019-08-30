import client.Client;
import server.ChatServer;

public class ChatApp {
    public static void main(String[] args) {

        ChatServer server = new ChatServer();

        Client[] clients = {
                new Client("Anna", server),
                new Client("Ivan", server),
                new Client("Vladimir", server),
                new Client("Peter", server),
                new Client("Dan", server)};

        for (Client client : clients) {
            client.sendRandomly("Всем привет");
        }
    }
}
