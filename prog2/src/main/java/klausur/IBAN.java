package klausur;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IBAN {

    public boolean ibanCheck(String in) throws FalscheIBANException {
        if (!((in.charAt(0) == 'D') && (in.charAt(1) == 'E') && (in.length() == 22))) {
            throw new FalscheIBANException("Pimmel entdeckt");
        } else {
            return true;
        }
    }

    public void ibanAusDateiLesen(String file) throws FalscheIBANException, FileNotFoundException {
        List<String> toCheck = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                toCheck.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("FileNotFoundException: Datei nicht gefunden");
        } catch (IOException e) {
            System.out.println("IOException: Fehler beim lesevorgang von datei");
            return;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Datei existiert nicht");
            return;
        }

        for (String ibans : toCheck) {
            ibanCheck(ibans);
        }
        System.out.println("big ibans");

    }

    public boolean dateienTest(String[] in) {
        for(int i = 0; i < in.length; i++) {
            try {
                ibanAusDateiLesen(in[i]);
            } catch (Exception e) {
                System.out.println("Fehler bei Datei: " + in[i]);
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FalscheIBANException, FileNotFoundException {
        IBAN iban = new IBAN();
        iban.ibanAusDateiLesen("iban22.txt");
    }

}