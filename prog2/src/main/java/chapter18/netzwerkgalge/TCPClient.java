package chapter18.netzwerkgalge;
import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class TCPClient {
    public static void main(String[] args)
    {
        final int PORT = 5000;
        final String HOST = "localhost";
        try (Socket connectionToServer = new Socket(HOST, PORT);
             PrintWriter pw = new PrintWriter(connectionToServer.getOutputStream(), true);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader serverResponse = new BufferedReader(new InputStreamReader(connectionToServer.getInputStream())))
        {
            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);
                String response = serverResponse.readLine();
                if (response != null) {
                    System.out.println(response);
                    if (response.startsWith("Herzlichen") || response.startsWith("Verloren")) {
                        break;
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}