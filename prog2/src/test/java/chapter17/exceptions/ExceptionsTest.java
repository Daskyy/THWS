package chapter17.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionsTest {
    @Test
    void testNumberFormatException() {
        Exceptions exceptions = new Exceptions();
        assertThrows(NumberFormatException.class, exceptions::NumberFormatException);
    }

    @Test
    void testArrayIndexOutOfBoundsException() {
        Exceptions exceptions = new Exceptions();
        assertThrows(ArrayIndexOutOfBoundsException.class, exceptions::ArrayIndexOutOfBoundsException);
    }

    @Test
    void testNullPointerException() {
        Exceptions exceptions = new Exceptions();
        assertThrows(NullPointerException.class, exceptions::NullPointerException);
    }

    @Test
    void testOutOfMemoryError() {
        Exceptions exceptions = new Exceptions();
        assertThrows(OutOfMemoryError.class, exceptions::OutOfMemoryError);
    }

    @Test
    void testFileNotFoundException() {
        Exceptions exceptions = new Exceptions();
        assertThrows(java.io.FileNotFoundException.class, exceptions::FileNotFoundException);
    }

    @Test
    void testArithmeticException() {
        Exceptions exceptions = new Exceptions();
        assertThrows(ArithmeticException.class, exceptions::ArithmeticException);
    }
}