package chapter17.Exceptions;

import java.io.FileNotFoundException;

public class Exceptions {
    public void NumberFormatException() throws NumberFormatException {
        int i = Integer.parseInt("abc");
    }

    public void ArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        arr[5] = 10;
    }

    public void NullPointerException() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    public void OutOfMemoryError() throws OutOfMemoryError {
        int[] arr = new int[Integer.MAX_VALUE];
    }

    public void FileNotFoundException() throws FileNotFoundException {
        // try {
            java.io.FileInputStream fis = new java.io.FileInputStream("nichtgefunden.txt");
        // } catch (java.io.FileNotFoundException e) {
        //    System.out.println("FileNotFoundException");
        // }
    }

    public void ArithmeticException() throws ArithmeticException {
        int i = 10 / 0;
    }
}
