package klausur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Konfigurator {

    public static List<String> liesKongurationsdatei() throws IOException {
        List<String> output = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("konfiguration.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                output.add(line);
            }
        }
        return output;
        //return Files.readAllLines(Paths.get("konfiguration.txt"));
    }

    public static Map<String, String> konfigurationEinlesen() throws IOException {
        List<String> zeilen = liesKongurationsdatei();
        Map<String, String> konfiguration = new HashMap<>();

        for (String zeile : zeilen) {
            String[] split = zeile.split("=");
            if (split.length == 2) {
                konfiguration.put(split[0], split[1]);
            }
        }

        return konfiguration;
    }

    public static void main(String[] args) {
        try {
            Map<String, String> konfiguration = konfigurationEinlesen();
            System.out.println(konfiguration);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}