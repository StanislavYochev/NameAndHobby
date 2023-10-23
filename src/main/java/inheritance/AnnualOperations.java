package inheritance;
public abstract class AnnualOperations {
    public abstract void calculateAnnualBonus();

    public void giveFeedback(){
        System.out.println("You did a great job! But no salary improvements!");
    }

    public abstract void takeTraining();

    public abstract void askQuestions();

    public abstract void giveHelp();

    public abstract void planTraining();
}
