package inheritance;

import inheritance.interfaces.JuniorActions;
import inheritance.interfaces.SeniorActions;

//base class; parent class; super class
public class Employee extends AnnualOperations implements JuniorActions, SeniorActions {
    //fields
    private String name;
    private String startDate;
    private double salary;

    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: invalid name!");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (!startDate.isEmpty()){
            this.startDate = startDate;
        }else {
            System.out.println("ERROR: invalid start date!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0){
            this.salary = salary;
        }else {
            System.out.println("ERROR: invalid salary!");
        }
    }

    //constructor with parameters
    public Employee(String name, String startDate, double salary){
        setName(name);
        setStartDate(startDate);
        setSalary(salary);
    }

    //methods
    public void calculateBonus(boolean isTargetAchieved, double bonus){
        if(isTargetAchieved){
            //System.out.println(getSalary() + bonus);
            setSalary(getSalary() + bonus);
        }
    }

    @Override
    public void calculateAnnualBonus() {
        System.out.println("Not possible to calculate bonus!");
    }

    @Override
    public void takeTraining() {
        System.out.println("Watching videos");
    }

    @Override
    public void askQuestion() {

    }

    @Override
    public void askQuestions() {
        System.out.println("i need help!");
    }

    @Override
    public void giveHelp() {
        System.out.println("You should try this...");
    }

    @Override
    public void planTraining() {
        System.out.println("You should watch this...");
    }
}