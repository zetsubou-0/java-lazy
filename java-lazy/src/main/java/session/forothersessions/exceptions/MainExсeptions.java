package session.forothersessions.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainExсeptions extends Object implements Cloneable {
   /*
   Исключения и ошибки возникают во время выполнения программы, когда появивишаяся проблема не может быть решена
   в текущем контесте и невозможно продолжение работы программы.

   При возникновении исключения в приложении создаётся объект, описывающий это исключение
        new Exception();
   Исключения - источник дополнительной информации.
   Суперкласс всех исключений: Throwable;

        Иерархия:

   -Throwable
         -Error
               -ThreadDeath
               -VirtualMachineError
                     -InternalError
                     -UnknownError
                     -OutOfMemoryError   (выбрасывыется, когда JVM не может выделить объект из-за нехватки памяти, а сборщик мусора не может высвободить её)
                     -StackOverflowError
               -AssertionError
         -Exception
               -RuntimeException
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
               -IOException
                     -CharacterCodingException
                           -MalformedInputException
                           -UnmappableCharacterException
                     -EOFException
                     -FileNotFoundException
                     -UFTDataFormatException
                     -SocketException
                     -SocketTimeoutException
                     -UnknownHostException
               -ReflectiveOperationException
                     -ClassNotFoundException
                     -NoSuchFieldException
                     -IllegalAccessException
                     -NoSuchMethodException
               -SQLException
               -AWTException
               -CloneNotSupportedException
               -InterruptedException
               -InvocationTargetException



   Error - представляет  собой серьёзные проблемы, которые не следует обрабатывать, поскольку они связаны с проблемами JVM
   Исключение делятся на:
      1)Проверяемые (Throwable, Exception) - должны быть обрабтаны в коде
      2)Непроверяемые (Error, RuntimeException) - обработка не нужна

         Обработка исключений:
      Ключевые слова использующиеся для обработки исключений:

      1) try  - начало блока, в котором может произойти исключительная ситуация
      2) catch - начало блока кода, предназначенного для перехвата и обработки исключения
      3) finally - начало блока, который должен выполнятся в любом случае. распологается после catch блока
      4) throw - служит для генерации исключений
            throw new Exception("Я бросил исключение");
      5) throws - прописывается после сигнатуры метода, обозначает, что метод может потенциально выбросить исключение с указанным типом
         public static void main(String[] args) throws FileNotFoundException {
            scanner = new Scanner(new FileReader("filename"));
         }

         Схема обработки исключений:
         try{
            код, который может привести в ошибке
         }catch(SomeExceptions e){
            действия, напрвленные на обработку исключения
         }finally{
            блок выполняющийся в любом случае. Он не обязателен
         }

         Можно отлавливать несколько исключений:

         1)
            try{
               код, который может привести в ошибке
            }catch(SomeExceptions e){
               действия, напрвленные на обработку исключения
            }catch(OtherExceptions e){
               действия, напрвленные на обработку исключения
            }

         2) начиная с java7 при одинаковой обработке исключений
            try{
               код, который может привести в ошибке
            }catch(SomeExceptions | OtherExceptions e){
               действия, напрвленные на обработку этих исключений
            }

      Начиная с Java7 можно использовать автоматическое закрытие ресурсов без блока finally(try-with-resources):

         try(открываем ресурс){
         } после блока ресурсы закроются автоматически

      Если в блоке finally возникло исключение, то оно может проглотить исключение возникшее в блоке try
     */
   public static void main(String[] args) {
      testMultiCatch();

      useTryWithResources();

      try {
         ignoreException();
      } catch (FileNotFoundException e) {
         System.err.println("Exception from try block");
      } catch (ClassNotFoundException e) {
         System.err.println("Exception from finally block");
      }

   }

   private static void testMultiCatch(){
      Scanner scanner = null;
      try {
         scanner = new Scanner(new FileReader("filename"));
         Class.forName("filename");
      } catch (FileNotFoundException e) {
         System.err.println("Файл отсутствует");
      } catch (ClassNotFoundException e) {
         System.err.println("Не получилось загрузить класс");
      }finally {
         if (scanner != null){
            scanner.close();
         }
      }
   }

   private static void throwOutOfMemoryError(){
      while (true) {
         String[] array = new String[Integer.MAX_VALUE];
      }
   }

   private static void useTryWithResources(){
      try(Scanner scanner = new Scanner(new FileReader("filename"))) {
         scanner.next();
      } catch (FileNotFoundException e) {
         System.err.println("File not found. Resources are closed");
      }
   }

   private static void ignoreException() throws FileNotFoundException, ClassNotFoundException {
      try {
         throw new FileNotFoundException();
      }finally {
         throw new ClassNotFoundException();
      }
   }
}
