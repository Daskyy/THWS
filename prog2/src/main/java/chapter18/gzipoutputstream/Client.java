package chapter18.gzipoutputstream;
import java.io.*;
import java.util.zip.GZIPOutputStream;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
        Socket connectionToServer = new Socket("localhost", 5555);
        OutputStream os = connectionToServer.getOutputStream();

        try (GZIPOutputStream gos = new GZIPOutputStream(os)) {
            gos.write(bytesToTransfer);
            gos.finish();
        }
    }
}
