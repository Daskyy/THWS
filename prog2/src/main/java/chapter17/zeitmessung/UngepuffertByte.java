package chapter17.zeitmessung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class UngepuffertByte {
    public long time() throws FileNotFoundException {
        long sum = 0;
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            new UngepuffertByte().copy("test.mp3", "copy.mp3");
            long end = System.currentTimeMillis();
            sum += end - start;
        }
        return sum / 10;
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

    public void copy (String source, String destination) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        byte[] b = new byte[1024];
        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(destination)) {
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
        long end = System.currentTimeMillis();
        System.out.println("Kopieren dauerte " + (end - start) + " ms");
    }
}
