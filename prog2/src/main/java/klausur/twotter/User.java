package klausur.twotter;

import java.io.Serializable;

public class User implements Serializable {
    final String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
