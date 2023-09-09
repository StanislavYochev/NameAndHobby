package oop;

public class Cat extends Pet{

    public Cat(Breed breed){
        super(breed);
    }

    //actions /method
    public void meow(){
        System.out.println(getName() + ": Meow meow!");
    }
}
