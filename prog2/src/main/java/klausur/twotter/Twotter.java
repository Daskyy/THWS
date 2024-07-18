package klausur.twotter;
import java.time.LocalDateTime;
import java.util.List;

public class Twotter {
    public static void main(String[] args) {
        TwotterSystem system = new TwotterSystem();
        User u = new User("joe", "joeRus!");
        system.addMessage(u, new Message("Hello World!"));
        system.addMessage(u, new Message("Helewewlo Wo22rld!"));
        system.addMessage(u, new Message("Helweewlo Wowe2rld!"));

        List<Message> a = system.getAllMessages();
        List<Message> m = system.getAllMessagesFromDate("2024-07-18");
        List<Message> d = system.getAllMessagesFromUser(u);
        System.out.println(d);
        System.out.println(a);
        System.out.println(m);
    }
}
