package HomeWork5;


import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num1 = scan.nextInt();
        System.out.println("Please enter 2nd number:");
        int num2 = scan.nextInt();
        double sum = 0.0;
        double avg = 0.0;
        sum = num1 + num2;
        avg = sum /2;

        System.out.println("Average:" + avg);
    }
}
