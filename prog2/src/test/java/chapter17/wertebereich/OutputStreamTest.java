package chapter17.wertebereich;

import org.junit.jupiter.api.Test;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class OutputStreamTest {

    // Einschränkung 1: b darf nicht null sein.
    // Einschränkung 2: off muss >= 0 sein.
    // Einschränkung 3: off muss < Array-length sein
    // Einschränkung 4: len darf nicht negativ sein
    // Einschränkung 5: len darf nicht > Array-length minus Offset sein


    @Test
    void testWrite_NullArray() {
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            assertThrows(NullPointerException.class, () -> fos.write(null, 0, 1));
        } catch (IOException e) {
            fail("IOException in testWrite_NullArray");
        }
    }

    @Test
    void testWrite_NegativeOffset() {
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(new byte[1], -1, 1));
        } catch (IOException e) {
            fail("IOException in testWrite_NegativeOffset");
        }
    }

    @Test
    void testWrite_OffsetGreaterThanArrayLength() {
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(new byte[1], 2, 1));
        } catch (IOException e) {
            fail("IOException in testWrite_OffsetGreaterThanArrayLength");
        }
    }

    @Test
    void testWrite_NegativeLength() {
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(new byte[1], 0, -1));
        } catch (IOException e) {
            fail("IOException in testWrite_NegativeLength");
        }
    }

    @Test
    void testWrite_LengthGreaterThanArrayLengthMinusOffset() {
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(new byte[1], 0, 2));
        } catch (IOException e) {
            fail("IOException in testWrite_LengthGreaterThanArrayLengthMinusOffset");
        }
    }
}