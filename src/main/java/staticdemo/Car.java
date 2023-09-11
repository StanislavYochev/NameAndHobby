package staticdemo;

public class Car extends DriveCar{
    //accessed by the instance i.e. object from this type/ class
    private String model;
    //accessed by the class, and it will be the same for all objects
    private static int counter;
    protected static final boolean FOUR_WHEEL_DRIVE; // give a value directly here or use static initializer

    private final int NUMBER_OF_WHEELS;

    static {
        System.out.println("Static initializer...");
        FOUR_WHEEL_DRIVE = true;
    }

    //setter and getters
    public int getNUMBER_OF_WHEELS() {
        return NUMBER_OF_WHEELS;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int getCounter() {
        return counter;
    }

    //constructor
    public Car(String model, int numberOfWheels){
        System.out.println("Constructor...");
        setModel(model);
        NUMBER_OF_WHEELS = numberOfWheels;
        counter++; //it will count all the objects that are created from this type (Class)
    }

    public final void finalMethod(){
        System.out.println("I am a final method and cannot be override");
    }

    public static void fakeProductionOfACar(){
        counter++;
    }

    @Override
    public void flyTheCar() {
        System.out.println("Flying all directions...");
    }
}
