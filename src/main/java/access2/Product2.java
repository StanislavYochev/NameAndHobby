package access2;

import access.Product;

public class Product2 extends Product {
    public double getPrice(){
        return super.price;
    }
    //final methods cannot be override
//    public void finalMethod(){
//        System.out.println("Changed");
//    }
}

