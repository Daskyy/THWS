package chapter18.touppercasewriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToUpperCaseWriterTest
{
  ToUpperCaseWriter writer;
  ByteArrayOutputStream baos;

  private void assertWriteAndFlush(char input, String expectedOutput) {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         OutputStreamWriter osw = new OutputStreamWriter(baos);
         ToUpperCaseWriter writer = new ToUpperCaseWriter(osw))
    {
      writer.write(input);
      writer.flush();
      String uppercase = baos.toString();
      assertEquals(expectedOutput, uppercase);
    }
    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }

  @Test
  public void writeCharTest()
  {
    assertWriteAndFlush('a', "A");
  }

  @Test
  public void writeCharTestWithNonChar()
  {
    assertWriteAndFlush('1', "1");
  }

  // Der Buchstabe a soll nach der Ausführung des Writers ein großes A sein
  @Test
  public void writeCharTest2() {
      assertWriteAndFlush('a', "A");
  }

  // Die Zahl 1 soll unverändert aus dem Writer herauskommen.
  @Test
  public void writeCharTestWithNonChar2() {
      assertWriteAndFlush('1', "1");
  }

  // Durchlaufen Sie die ersten 128 Zeichen des ASCII-Codes: Die Buchstaben von a-z
  // sollen als Großbuchstaben aus dem Stream herauskommen.
  @Test
  public void writeCharTest3() {
      for (char i = 1; i < 128; i++) {
        if(i >= 'a' && i <= 'z') {
          assertWriteAndFlush(i, String.valueOf(Character.toUpperCase(i)));
        }
      }
  }

  // Durchlaufen Sie die ersten 128 Zeichen des ASCII-Codes: Alle Zeichen außer den
  // Buchstaben von a-z sollen unverändert aus dem Stream herauskommen.
  @Test
    public void writeCharTest4() {
        for (char i = 1; i < 128; i++) {
            if(i < 'a' || i > 'z') {
                assertWriteAndFlush(i, Character.toString(i));
            }
        }
    }
}
