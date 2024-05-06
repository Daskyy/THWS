package chapter18.gzipoutputstream;

import java.io.*;
import java.net.*;
import java.util.zip.GZIPInputStream;

public class Server {
    public static void main(String[] args) {
        final int PORT = 5555;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            try (Socket clientSocket = serverSocket.accept();
                 GZIPInputStream gzipIS = new GZIPInputStream(clientSocket.getInputStream());
                 InputStreamReader isr = new InputStreamReader(gzipIS);
                 BufferedReader br = new BufferedReader(isr)) {

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}