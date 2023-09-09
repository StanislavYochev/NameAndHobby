package access2;

import access.Product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();// default constructor

        System.out.println(product.name);//name is public i.e. accessible from anywhere
        //System.out.println(product.price);//protected not accessible outside package
        //System.out.println(product.weight);// default not accessible outside package

        Product2 product2 = new Product2();

        System.out.println(product2.name);
        System.out.println(product2.getPrice());
    }
}
