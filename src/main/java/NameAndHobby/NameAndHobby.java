package NameAndHobby;

import java.util.Scanner;

public class NameAndHobby {
    public static void main (String [] args){
    System.out.println("Hello!");

    System.out.println("What is your name?");

    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();

    System.out.println("What is your hobby,Stanislav?");

    String hobby = scanner.nextLine();

    System.out.println("Stanislav, thanks for the answers, have a nice day!");


}
}

