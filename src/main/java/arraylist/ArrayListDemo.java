package arraylist;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Sofia");
        cities.add(0, "Plovdiv");
        cities.add("Burgas");

        System.out.println(cities);

        cities.remove(0);
        cities.remove("Burgas");

        System.out.println(cities);
    }
}
