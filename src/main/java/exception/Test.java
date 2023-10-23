package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws CookieMonsterSadException {
//we have try catch block for checked exception - IOException
        try{
            ReadingFile.readFile("C\\blah\\blahBlah.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not present: " + e.getMessage());
        }catch (IOException e){
            System.out.println("Operation with the file are falling" + e.getMessage());
        }finally {
            System.out.println("I will be always executed :) ");
        }

        System.out.println("Code after exception");

        //example of unchecked exception
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:a");

        int a = scanner.nextInt();

        System.out.println("Please enter a number:b");

        int b = scanner.nextInt();

        try{
            System.out.println("The result is: " +a/ b);
        }catch (ArithmeticException e){
            throw new CookieMonsterSadException(e.getMessage(), a);
        }

        int[] array = {3, 5, 8};
        System.out.println(array[array.length]);
    }
}
