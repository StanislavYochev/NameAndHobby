package decision;

public class DecisionMaking {
    public static void main(String[] args){
        printUserDetails(0);//negative
        printUserDetails(-1);
        printUserDetails(13);
        printUserDetails(14);
        printUserDetails(17);
        printUserDetails(18);
        printUserDetails(65);
        printUserDetails(66);
        printUserDetails(130);
        printUserDetails(131);//negative - out

        System.out.println("---------------");
        printMonthOfTheYear(1);

    }


    public static void printUserDetails(int userAge){
        //kid: 0 - 13
        //teenager 14 - 17
        //adult 18 - 65
        //retired 66 - 130

        if (userAge < 0 || userAge > 130){
            System.out.println("Error: Invalid entry");
            return;
        }

        if (userAge >= 0 && userAge <=13){
            System.out.printf("The user is kid with the age of %d\n", userAge);
        }else if (userAge >= 14 && userAge <=17){
            System.out.printf("The user is teenager with the age of %d\n", userAge);
        }else if (userAge >=18 && userAge <=65){
            System.out.printf("The user is adult with the age of %d\n", userAge);
        }else {
            System.out.printf("The user is retired with the age of %d\n", userAge);
        }

    }
    public static void printMonthOfTheYear(int month){
        switch (month){
            case 1:
                System.out.println("Selected month is January.");
                break;
            case 2:
                System.out.printf("Selected month is February. \n");
                break;
            default:
                System.out.println("Error: Invalid entry.");
        }
    }
}
