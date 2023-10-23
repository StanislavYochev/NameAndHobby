package inheritance;

public class Developer extends Employee{
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        if (!programingLanguage.isEmpty()){
            this.programingLanguage = programingLanguage;
        }else {
            System.out.println("ERROR: invalid programing language!");
        }
    }

    //constructor
    public Developer(String name, String startDate, double salary, String programingLanguage) {
        super(name, startDate, salary);//mandatory!!! calling the constructor of the super class here
        setProgramingLanguage(programingLanguage);
    }

    public void calculateAnnualBonus(){
        System.out.println("You have a bonus: 1000");
    }
}
