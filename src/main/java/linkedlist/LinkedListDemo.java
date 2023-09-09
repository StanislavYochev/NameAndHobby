package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add(0, "Audi");
        cars.add("Lada");

        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);
    }
}
