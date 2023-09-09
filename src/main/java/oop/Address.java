package oop;

public class Address {
    private String country;
    private String city;
    private int postalCode;
    private String additionalData;

    public String getCountry(){
        return country;
    }

    //Todo add data vallidation for all setters
    public void setCountry(String country){
        this.country = country;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public int getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(int postalCode){
        this.postalCode = postalCode;
    }

    public String getAdditionalData(){
        return additionalData;
    }

    public void setAdditionalData(String additionalData){
        this.additionalData = additionalData;
    }

    //type II constructor
    public Address(String country, String city, int postalCode, String additionalData){
        setCountry(country);
        setCity(city);
        setPostalCode(postalCode);
        setAdditionalData(additionalData);
    }

    //type II construcot overload
    public Address(String country){
        setCountry(country);
    }

    //type I constructor
    public Address(){
        setCountry("Bulgaria");
        setCity("Sofia");
        setPostalCode(1000);
        setAdditionalData("-");
    }

    //copy constructor
    public Address(Address address){
        //it is not mandatory to use the setters here because we hav a valid object alredy
        this.city = address.city;
        this.country = address.country;
        this.postalCode = address.postalCode;
        this.additionalData = address.additionalData;
    }

    //method override from the Object class
    public String toString(){
        return String.format("Country is: %s, city is: %s, postal code is: %d, additional data is: %s",
                country, city, postalCode, additionalData);
    }
}
