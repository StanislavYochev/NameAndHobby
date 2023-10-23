package inheritance;
public class Test {
    public static void main(String[] args) {
        String input = "userInput";
        Developer dev1 = new Developer(input, "2023/01/01", 2000.00,
                "JAVA");
        QualityAssurance qa1 = new QualityAssurance("Gosho", "today", 2000.00,
                true);

        dev1.calculateBonus(true, 500);
        System.out.println(dev1.getSalary());

        qa1.calculateBonus(true, 500);
        System.out.println(qa1.getSalary());

        dev1.calculateAnnualBonus();
        qa1.calculateAnnualBonus();
        qa1.calculateAnnualBonus(1000);

    }
}
