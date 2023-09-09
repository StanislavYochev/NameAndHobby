package stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> kitchenDrawer = new Stack<>();

        kitchenDrawer.push("Pan");
        kitchenDrawer.push("Dish");
        kitchenDrawer.push("Fork");

        System.out.println(kitchenDrawer);

        System.out.println("Taking top element:");
        System.out.println(kitchenDrawer.pop());
        System.out.println("What has left:");

        System.out.println(kitchenDrawer);

        kitchenDrawer.add(1, "Glove");//This is not stack operation.This is list operation.

        System.out.println(kitchenDrawer);


    }
}
