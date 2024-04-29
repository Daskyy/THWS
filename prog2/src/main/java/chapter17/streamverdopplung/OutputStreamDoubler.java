package chapter17.streamverdopplung;

import java.io.*;

public class OutputStreamDoubler {
    OutputStream out1;
    OutputStream out2;

    public static void main(String[] args) {
        // Erstellen Sie FileOutputStream-Objekte für file1.txt und file2.txt
        try (FileOutputStream fos1 = new FileOutputStream("file1.txt");
             FileOutputStream fos2 = new FileOutputStream("file2.txt")) {

            OutputStreamDoubler doubler = new OutputStreamDoubler(fos1, fos2);

            for (int i = 0; i < 10; i++) {
                doubler.write(i);
            }

            doubler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public OutputStreamDoubler(OutputStream out1, OutputStream out2) {
        this.out1 = out1;
        this.out2 = out2;
    }

    public void close() throws IOException {
        try {
            out1.close();
        } catch (IOException e) {
            throw new IOException("Out 1 konnte nicht geschlossen werden");
        }
        try {
            out2.close();
        } catch (IOException e) {
            throw new IOException("Out 2 konnte nicht geschlossen werden");
        }
    }

    public void write(int b) throws IOException {
        try {
            out1.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out2.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
