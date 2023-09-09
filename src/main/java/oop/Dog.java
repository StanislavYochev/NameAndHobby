package oop;

public class Dog extends Pet{
    //construcotr
    public Dog(Breed breed){
        super(breed); //calling the constructors of the super /parent class
    }

    //actions /methods:
    public void bark(){
        System.out.println(getName() + ": Bau bau!");
    }

    //method overload
    public void bark(String noise){
        System.out.println(getName() + ": " + noise);
    }

    //method override - changing the implementation of the method
    public void eat(){
        System.out.println(getName() + " is eating fast!");
    }
}
