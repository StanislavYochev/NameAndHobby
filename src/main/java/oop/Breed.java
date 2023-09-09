package oop;

public class Breed {
    private String breedName;
    private String characteristic;
    private String possibleillnes;

    public String getBreedName() {
        return breedName;
    }

    //Todo add data validation in all setter method
    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }
    public String getCharacteristic(){
        return characteristic;
    }


    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getPossibleillnes(){
        return  possibleillnes;
    }

    public void setPossibleillnes(String possibleillnes) {
        this.possibleillnes = possibleillnes;
    }

    //construcotr
    public Breed(String name, String chars, String illnes){
        setBreedName(name);
        setCharacteristic(chars);
        setPossibleillnes(illnes);
    }
}
