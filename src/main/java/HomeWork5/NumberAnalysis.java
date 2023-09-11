package HomeWork5;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = in.nextInt();

        System.out.println("Enter second number: ");
        int b = in.nextInt();

        System.out.println("Enter third number: ");
        int c = in.nextInt();

        int greatestNumber = a;

        if ((a == b) && (b == c)){
            System.out.println("Enteret number is equal.");
        }else{
            if (b > greatestNumber){
                greatestNumber = b;
            }
            if (c > greatestNumber){
                greatestNumber = c;
            }
            System.out.println("The greatest number is: " + greatestNumber);

            if ((a >= 0) && (b >= 0) && (c >= 0)){
                System.out.println("Enteret number is all positive.");
            } else if ((a < 0) && (b < 0) && (c < 0)) {
                System.out.println("Entered number is all negative.");
            }
            else {
                System.out.println("Entered number is mixed.");
            }
        }
    }
}
