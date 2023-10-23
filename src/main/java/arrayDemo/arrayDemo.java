package arrayDemo;

import java.util.Arrays;

public class arrayDemo {
    public static void main(String[] args) {
        int [] numbers = {4, 12, 43, 543, 56, 234, 4};
        int [] numbers2 = new int[4];//4 elements will be saved here

        System.out.println("-----");
        System.out.println(numbers);
        System.out.println("-----");

        int [] [] matrix = {
                {3, 4, 7},
                {46, 123, 333, 4232, 2432423},
                {7, 8},
                {0, 78, 2, 43}
        };

        String [] cities = {"Sofia", "Plovdiv", "Gotse Delchev", "Ruse", "Burgas", "Varna"};
        char [] mandatoryPasswordSymbols = {'&', '$', '@'};

        numbers2[3] = 5;

        printValues(numbers);
        System.out.println("--------------------");
        printValuesUsingForEach(numbers);
        System.out.println("--------------------");
        printValues(numbers2);
        System.out.println("--------------------");
        printValues(cities);

        printMatrix(matrix);
    }

    public static void printValues(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("At index: %d, is the value: %d\n", i, array[i]);
        }
    }

    public static void printValuesUsingForEach(int [] array){
        for(int i : array){
            System.out.printf("Current value is: %d.\n", i);
        }
    }

    public static  void printMatrix(int [] [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Element on row %d and column %d is %d\n", i, j, array[i][j]);
            }
        }
    }

    public static void printValues(String [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("At index: %d, is the value: %s\n", i, array[i]);
        }
    }
}
