package klausur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class test {
    public void start() throws IOException
    {
        try (ServerSocket ss = new ServerSocket(5000); Socket connection = ss.accept();) {
            // spielen
        } catch (IOException e) {
            // g.reset()
        }
    }
}
