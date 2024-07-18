package klausur.twotter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwotterSystem {
    private Map<User, List<Message>> userMessages = new HashMap<>();

    public void addMessage(User user, Message message) {
        userMessages.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getAllMessagesFromDate(String date) {
        List<Message> out = new ArrayList<>();
        for (List<Message> messages : userMessages.values()) {
            for (Message message : messages) {
                if (message.timestamp.equals(date)) {
                    out.add(message);
                }
            }
        }
        return out;
    }

    public List<Message> getAllMessagesFromUser(User user) {
        return userMessages.getOrDefault(user, new ArrayList<>());
    }

    public List<Message> getAllMessages() {
        List<Message> allMessages = new ArrayList<>();
        userMessages.values().forEach(allMessages::addAll);
        return allMessages;
    }
}
