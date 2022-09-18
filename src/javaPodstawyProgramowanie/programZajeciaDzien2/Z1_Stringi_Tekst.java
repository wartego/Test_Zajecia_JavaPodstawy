package javaPodstawyProgramowanie.programZajeciaDzien2;

public class Z1_Stringi_Tekst {
    private static final char DEFAULT_CHAR = '\u0000'; // znak null jako char

    public static void main(String[] args) {
String input = "Aleksander ";
        System.out.println("Original word: " + input);
        System.out.println("Last char: " + getLastCharacter(input));
    }
    public static char getLastCharacter(String input) {
        if(input != null && !input.isBlank()) { // zabezpieczenie sie przed pustym Stringiem
            String trimmedText = input.trim();
            int lastPosition = trimmedText.length() - 1;
            return trimmedText.charAt(lastPosition);
        }
        return DEFAULT_CHAR;
    }
}
