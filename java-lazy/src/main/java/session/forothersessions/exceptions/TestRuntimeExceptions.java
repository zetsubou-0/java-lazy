package session.forothersessions.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestRuntimeExceptions {
    /* -RuntimeException
                     -BufferOverflowException
                     -BufferUnderflowException
                     -ArithmeticException
                     -ClassCastException - генерируется если объекты не совместимы(попытка ввести несовместимый объект в коллекцию)
                     -IllegalArgumentException
                           -IllegalCharsetNameException
                           -UnsupportedCharsetException
                           -NumberFormatException
                     -IllegalMonitorStateException
                     -IllegalStateException
                           -IllegalComponentStateException
                     -IndexOutOfBoundsException
                           -ArrayIndexOutOfBoundsException
                           -StringIndexOutOfBoundsException
                     -NullPointerException
                     -UnsupportedOperationException
                     -NoSuchElementException
     */
    public static void main(String[] args) {
        //Перехватывать RuntimeException не нужно!!!!! Далее перехватываются только с целью обучения

        //ClassCastException
        try {
            generateClassCastException();
        } catch (ClassCastException e) {
            System.err.println("Перехватили ClassCastException: " + e);
            System.out.println();
        }
        //NullPointerException
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.err.println("Перехватили NullPointerException: " + e);
            System.out.println();
        }


    }

    private static void generateClassCastException(){
        Integer num = (Integer)new Object();
    }

    private static void generateNullPointerException(){
        Integer integer = null;
        int hashcode = integer.hashCode();
    }
}
