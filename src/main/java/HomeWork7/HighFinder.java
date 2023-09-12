package HomeWork7;

public class HighFinder {
    public static void main(String[] args) {
        int a = 20;
        int b = 25;
        int c = 35;
        int largest = Math.max(a, Math.max(c, b));
        System.out.println("The largest number is:" + Math.max(a, Math.max(c, b)));
    }
}
