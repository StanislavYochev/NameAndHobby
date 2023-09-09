package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private int money;
    private LinkedList<Product> bagOfProduct = new LinkedList<>();

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: invalid entry for person name!");
        }
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        if (money > 0){
            this.money = money ;
        }else {
            System.out.println("Error: invalid entry for person money!");
        }
    }
    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }
    public void buyProduct(Product product){
        if (this.money >= product.getCost()){
            bagOfProduct.add(product);
            this.setMoney(this.money - product.getCost());
            System.out.printf("%s bought %s\n", this.name, product.getName());
        }else {
            System.out.printf("%s can't afford %s\n", this.name, product.getName());
        }
    }
    public void printItemsInTheBag(){
        if (bagOfProduct.size() == 0){
            System.out.printf("%s - Nothing bought\n", this.name);
            return;
        }
        String itemName = "";
        //for each cycle
        for (Product product : bagOfProduct){
            if (bagOfProduct.size() > 1){
                itemName += product.getName() + ",";
            }else {
                itemName += product.getName();
            }
        }
        if (bagOfProduct.size() > 1){
            //method call from this method
            itemName = trimProducsNames(itemName);
        }
        System.out.printf("%s - %s\n", this.name, itemName);
    }
    //internal method
    private String trimProducsNames(String input){
        input = input.trim(); //remove the space at the end
        input = input.substring(0, input.length() -1);//remove the last letter in the string
        return input;
    }
}
