package org.example.Lecture5.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture5 {
    public static void main(String[] args) {
        //arithmeticException();
        //indexOutSideOfBoundsException();
        //illegalArgumentException(-10);
        //parseStringToInt("twenty");
        openFile("src/main/java/org/example/Lecture5/Demo/test.txt");
        //multipleCatch("0.5");
        //catchThemAll();
    }
    public static void arithmeticException() throws ArithmeticException{
        int number = 10/0;
        System.out.println("Result is: " + number);
    }

    public static void illegalArgumentException(int age) throws IllegalArgumentException{
        if (age<0){
            throw new IllegalArgumentException("Age should not be negative");
        }
        System.out.println("Your age is: " + age);
    }

    public static void indexOutSideOfBoundsException(){
        Integer[] numbers = {234,4253,355};
        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (IndexOutOfBoundsException exceptionMessage){
            System.out.println("Array is with less values that expected. Inner Exception: " + exceptionMessage);
        }
    }

    public static int parseStringToInt(String number){
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException exceptionMessage){
            System.out.println("The number provided is not a real number and cannot be parsed");
            System.out.println("Inner exception is: " + exceptionMessage);
            return -1;
        }
    }

    public static void openFile(String path){
        Scanner scanner = null;
        try {
            File file = new File(path);
            scanner = new Scanner(file);
            System.out.println("This is my content:");
            int count = 0;
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
                if (count > 300){
                    throw new Exception("File should not have more than 3 lines of data.");
                }
                count++;
            }
        } catch (FileNotFoundException exceptionFileNotFoundMessage) {
            System.out.println("File is not found, here is the inner exception: " + exceptionFileNotFoundMessage);
        } catch (Exception exceptionMessage) {
            System.out.println("Incorect data. Inner exception: " + exceptionMessage);
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }
        System.out.println("Program End!");
    }

    public static void multipleCatch(String textNumber) throws NumberFormatException, ArithmeticException{
        System.out.println("Start");
        try{
            int parsedNumber = Integer.parseInt(textNumber);
            int calculatedNumber = 200 / parsedNumber;
            System.out.println("Result is: " + calculatedNumber);
        } catch (NumberFormatException exceptionMessage){
            //System.out.println("Number is not parsed properly. Inner Exception: " + exceptionMessage);
            throw new NumberFormatException("Please provide proper number for parsing. Internal Exception: " + exceptionMessage);
        } catch (ArithmeticException exceptionMessage){
            //System.out.println("Number is not divided. Inner Exception: " + exceptionMessage);
            throw new ArithmeticException("Please do not use zero number for dividing. Internal Exception: " + exceptionMessage);
        } catch (Exception exceptionMessage){
            System.out.println("Generic error that is catch for handling.");
//            System.out.println(exceptionMessage.getClass());
//            if (exceptionMessage.getClass().equals("class java.lang.NumberFormatException")){
//                throw new NumberFormatException("Not able to parse the number");
//            }
        }
        System.out.println("End");
    }

    public static void catchThemAll(){
        try{
            throw new InputMismatchException("test");
        } catch (Exception exceptionMessage){
            System.out.println("The input was not integer");
            System.out.println("The inner exception is: " + exceptionMessage);
        }
    }
}
