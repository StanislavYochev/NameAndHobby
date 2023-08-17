package data.types;

public class Variables {
    //static variable
    static String staticString;

        //instance veriable
    byte age;
    String name;
    public static void main(String[] args) {
        //local veriables
        //primitive data types
        byte age = 20;
        short workingDaysPerYear = 200;
        int secondsInWorkingWeek = 34535634;
        long secondsInAYear = 3456346346345345345l;
        float accountBalance = 23423423.56f;
        double resultfOfCalculation = 0.0;
        boolean amIRich = false;
        char specialSymbol = '&';

        //referent data types
        String firstName = "Stanislav";
        String firstNAME = "Jasmina";
    }

    public void printAge() {
        System.out.println("Age is: " + age + ".");
    }

    public void printCanDrink() {
        if (age >= 18) {
            System.out.printf("Yes! Because the age is: %d\n", age);
        } else {
            System.out.println("Sorry :(");
        }
    }
}
