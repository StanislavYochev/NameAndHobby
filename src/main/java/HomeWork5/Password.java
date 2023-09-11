package HomeWork5;

import java.util.Scanner;

public class Password {
    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                        "2. A password consists of only letters,digits and symbols.\n" +
                        "Input a password (You are agreeing to the above Terms and Conditions.): \n");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }

    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        int specialCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else if (is_Special(ch)) specialCount++;
            else return false;
        }


        return (charCount >= 1 && numCount >= 1);

    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    public static boolean is_Special(char ch) {
        switch (ch) {
            case '@':
            case '#':
            case '$':
            case '%':
            case '^':
            case '&':
            case '+':
            case '=':
            case '~':
                return true;
            default:
                return false;
        }
    }
}


