package javaPodstawyProgramowanie.programZajeciaDzien2;

public class StringValidator {
    public static boolean isValidString(String input) {
        return input != null && !input.isBlank(); // zabezpieczenie sie przed pustym Stringiem
    }
}
