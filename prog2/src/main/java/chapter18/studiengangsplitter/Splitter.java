package chapter18.studiengangsplitter;

import java.io.*;

public class Splitter {
    public void splitStudiengaenge(String dateiname) throws MatrikelNummerException {
        try (BufferedReader reader = new BufferedReader(new FileReader(dateiname));
             PrintWriter writerWInf = new PrintWriter(new FileWriter("WInfNr.txt"));
             PrintWriter writerInf = new PrintWriter(new FileWriter("InfNr.txt"));
             PrintWriter writerEC = new PrintWriter(new FileWriter("ECNr.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int matrikelNummer;
                try {
                    matrikelNummer = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    throw new MatrikelNummerException("Ungültige Matrikelnummer: " + line);
                }

                if (matrikelNummer >= 5000000 && matrikelNummer <= 5099999) {
                    writerWInf.println(matrikelNummer);
                } else if (matrikelNummer >= 5100000 && matrikelNummer <= 5199999) {
                    writerInf.println(matrikelNummer);
                } else if (matrikelNummer >= 6100000 && matrikelNummer <= 6199999) {
                    writerEC.println(matrikelNummer);
                } else {
                    throw new MatrikelNummerException("Ungültige Matrikelnummer: " + matrikelNummer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Splitter splitter = new Splitter();
        try {
            splitter.splitStudiengaenge("MatrNr.txt");
        } catch (MatrikelNummerException e) {
            System.out.println(e.getMessage());
        }
    }
}
