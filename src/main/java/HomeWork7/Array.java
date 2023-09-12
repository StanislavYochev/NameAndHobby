package HomeWork7;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
    }
}
