package klausur.twotter;

import java.io.Serializable;
import java.time.LocalDate;

public class Message implements Serializable {
    public final String text;
    public String timestamp;

    public Message(String text) {
        if (text.length() > 140) {
            throw new RuntimeException("Pimmelarsch");
        }
        this.text = text;
        this.timestamp = LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + text + '\'' +
                ", date='" + timestamp + '\'' +
                '}';
    }
}
