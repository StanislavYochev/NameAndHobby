//defenition of package
package DemoFirst;

import java.util.Scanner;

//defebutuib of a class
public class FirstDemo {

    //method
    public static void main (String [] args){
        System.out.println("Hello Java");

        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in); //Creating a Scanner variable

        String name = scanner.nextLine(); // Read user input

        System.out.println("How old are you?");

        int age = scanner.nextInt();

        System.out.println("Nice to meet you, " +name + ". Your age is: " + age);

    }

}
