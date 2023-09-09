package oop;

public class Pet implements PetAction{
    //states /characteristics /instance variables
    private Breed breed;//composition
    private float weight;
    private String sex;
    private byte age;
    private String name;
    private Address address;//aggregation

    //setters and getters

    public Breed getBreed(){
        return breed;
    }


    //gives us possibility  to have data validation
    private void setBreed(Breed breed){
        if(!breed.equals(null)){
            this.breed = breed;
        }else{
            System.out.println("Error: Invalid entry for breed!");
    }
}

public float getWeight(){
    return weight;
    }

    //give us possibility to have data validation

    public void setWeight(float weight) {
        if (weight > 0){
        this.weight = weight;
    }else{
            System.out.println("Error: Invalid entry for weight!");
        }
}
    public String getSex(){
    return sex;
    }

    //give us possibility to have data validation
    public void setSex(String sex){
        if(sex.isEmpty()){
            System.out.println("Error: Invalid entry for sex!");
        }else{
            this.sex = sex;
        }
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        if(!address.equals(null)){
            this.address = address;
        }else{
            System.out.println("Error: Invalid entry for address!");
        }
    }

    public byte getAge() {
        return age;
    }

    //give us possibility to have data validation
    public void setAge(byte age){
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("Error: Invalid entry for age!");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(!name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Error: Invalid entry for name!");
        }
    }

    public Pet(Breed breed){
        setBreed(breed);
    }

    //actions /method
    public void eat(){
        System.out.println(this.name + "is eating...");
    }

    @Override
    public void walk(){
        System.out.println(this.name + "is walking...");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping...");
    }

@Override
    public void makeNoise(){
    System.out.println(this.name + "is noise...");
}

    @Override
    public void goingToTheVet() {

    }

    @Override
    public void goingToVet(){
    System.out.println(this.name + "is going to vet...");
}
}
