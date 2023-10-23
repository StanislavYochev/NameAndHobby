package exception;

public class CookieMonsterSadException extends Exception //this will be checked exception
{
    public CookieMonsterSadException(String message, int cookiesCount){
        super(message + ". You cannot divide" + cookiesCount + " cookies evenly amount 0 friends!");
    }
}
