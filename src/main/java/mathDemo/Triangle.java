package mathDemo;

public class Triangle {
    public static int calculateAreaByTwoSidesAndAngles(int a, int b, double angle){
        return (int) (0.5 * a * b * Math.sin(Math.toRadians(angle)));
    }
}
