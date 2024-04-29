package chapter17.zeitmessung;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long ungepuffert = 0;
        long gepuffert = 0;
        long ungepuffertByte = 0;
        try {
            ungepuffert = new Ungepuffert().time();
            gepuffert = new Gepuffert().time();
            ungepuffertByte = new UngepuffertByte().time();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Ungepuffert: " + ungepuffert + " ms");
        System.out.println("Gepuffert: " + gepuffert + " ms");
        System.out.println("Ungepuffert mit 1024 Byte: " + ungepuffertByte + " ms");
        double diff1 = (double) (ungepuffert - gepuffert) / ungepuffert * 100;
        double diff2 = (double) (ungepuffert - ungepuffertByte) / ungepuffert * 100;
        double diff3 = (double) (gepuffert - ungepuffertByte) / gepuffert * 100;
        System.out.println("Gepuffert ist " + diff1 + "% schneller als ungepuffert");
        System.out.println("Ungepuffert mit 1024 Byte ist " + diff2 + "% schneller als ungepuffert");
        System.out.println("Ungepuffert mit 1024 Byte ist " + diff3 + "% schneller als gepuffert");
    }

    //

    public static void choose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Methode des Kopierens soll verwendet werden?");
        System.out.println("1: Ungepuffert");
        System.out.println("2: Gepuffert");
        System.out.println("3: Ungepuffert mit 1024 Byte");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                new Ungepuffert();
                break;
            case 2:
                new Gepuffert();
                break;
            case 3:
                new UngepuffertByte();
                break;
            default:
                System.out.println("Ungültige Eingabe");
                choose();
        }
    }
}
