package operators;

public class ArithmeticOperations {
    public static void main(String[] args){
        int number = 10;
        int num2 = 20;
        //how to determine if a number is even or odd
        System.out.println(6 % 2);

        System.out.println(number++);
        System.out.println(++num2);
        System.out.println(number);

        System.out.println(number != num2);//true

        System.out.println((number != num2) && true);//true
        System.out.println((number != num2) && false);//False
        System.out.println((number != num2) || true);//true
        System.out.println((number != num2) || false);//true
        System.out.println(!(number != num2) || false);//False

        int sum = number + num2;
        sum +=8; //sum = sum + 8;


        System.out.println(sum);
        int a = 10;
        int b = 11;

        System.out.println((a > b ? "num2 is greater!" : "number is equal to or greater to num2"));


    }
}
