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

  @BeforeEach
  public void prepareTest()
  {
    baos = new ByteArrayOutputStream();
    OutputStreamWriter osw = new OutputStreamWriter(baos);
    writer = new ToUpperCaseWriter(osw);
  }

  @Test
  public void writeCharTest()
  {
    try
    {
      writer.write('a');
      writer.flush();
      String uppercase = baos.toString();
      assertEquals(uppercase, "A");
      writer.close();
    }
    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }

  @Test
  public void writeCharTestWithNonChar()
  {
    try
    {
      writer.write('1');
      writer.flush();
      String uppercase = baos.toString();
      assertEquals(uppercase, "1");
      writer.close();
    }
    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }
  
  @AfterEach
  public void cleanUp()
  {
    try
    {
      writer.close();
    }
    catch (IOException e)
    {
      fail("IOException" + e.getMessage());
    }
  }
}
