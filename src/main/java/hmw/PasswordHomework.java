package hmw;

public class PasswordHomework {
    public static void main(String[] args) {
        System.out.println(isAValidPassword("sdfgsdgsdfgs"));
        System.out.println(isAValidPassword("Pa$$w0rd"));
    }

    public static boolean isAValidPassword(String password) {
        String regex = "\\A(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}\\z";
        return password.matches(regex);
    }
}
