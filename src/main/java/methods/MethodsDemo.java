package methods;

import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        //calling a statick method directly without an object;
        System.out.println(add(5, 6));
        System.out.println(add(add(a,b), b));

        System.out.println("Please enter a:");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();

        System.out.println("Please enter b:");
        int input2 = sc.nextInt();

        System.out.println("This sum is:" + add(input1, input2));
    }
    //static method - no need of an object
    public static int add(int a, int b){
        return a + b;
    }
}
