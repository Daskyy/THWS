package klausur.twotter;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class UserManager implements ObjectManager<User> {
    private static final String FILE_PATH = "user.dat";

    @Override
    public void serialize(List<User> user) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            os.writeObject(user);
        } catch (IOException e) {
            throw new RuntimeException("Fehler");
        }
    }

    @Override
    public List<User> deserialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Fehler");
        }
    }

    public static void main(String[] args) {
        List<User> users = List.of(new User("user1", "password1"), new User("user2", "password2"));
        UserManager userManager = new UserManager();
        userManager.serialize(users);

        List<User> deserialized = userManager.deserialize();
    }
}
