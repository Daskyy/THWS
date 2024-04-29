package chapter17.zeitmessung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ungepuffert {
    public long time() throws FileNotFoundException {
        long sum = 0;
        for (int i = 0; i < 2; i++) {
            long start = System.currentTimeMillis();
            new Ungepuffert().copy("test.mp3", "copy.mp3");
            long end = System.currentTimeMillis();
            sum += end - start;
        }
        return sum / 2;
    }

    public void choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Pfad der Quelldatei ein:");
        String source = scanner.nextLine();
        System.out.println("Bitte geben Sie den Pfad der Zieldatei ein:");
        String destination = scanner.nextLine();
        try {
            copy(source, destination);
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
            choose();
        }
    }

    public void copy(String source, String destination) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(destination);
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            throw new FileNotFoundException();
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Kopieren dauerte " + (end - start) + " ms");
    }
}
