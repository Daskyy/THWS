package chapter18.netzwerkgalge;
import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TCPServer {
    private static final String WORT = "java";
    private static final int MAX_ATTEMPTS = 15;

    public static void main(String[] args) {
        final int PORT = 5000;
        try(ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            PrintWriter pw = new PrintWriter(connection.getOutputStream(), true))
        {
            int attempts = 0;
            StringBuilder gameStatus = new StringBuilder("_".repeat(WORT.length()));
            String line;
            while ((line = br.readLine()) != null && attempts < MAX_ATTEMPTS) {
                if (line.isEmpty()) {
                    pw.println("Verloren. Das Wort war: " + WORT);
                    break;
                }
                if (line.equals(WORT)) {
                    pw.println("Herzlichen Glückwunsch! Du hast das Wort erraten.");
                    break;
                }
                attempts++;
                for (int i = 0; i < WORT.length(); i++) {
                    if (WORT.charAt(i) == line.charAt(0)) {
                        gameStatus.setCharAt(i, line.charAt(0));
                    }
                }
                if (gameStatus.toString().equals(WORT)) {
                    pw.println("Herzlichen Glückwunsch! Du hast das Wort erraten.");
                    break;
                }
                pw.println("Aktuelles Wort: " + gameStatus + " Versuche: " + attempts + "/" + MAX_ATTEMPTS);
            }
            if (attempts == MAX_ATTEMPTS) {
                pw.println("Verloren. Das Wort war: " + WORT);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}