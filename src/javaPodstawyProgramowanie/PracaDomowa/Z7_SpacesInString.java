package javaPodstawyProgramowanie.PracaDomowa;

import javaPodstawyProgramowanie.programZajeciaDzien2.StringValidator;

public class Z7_SpacesInString {
    public static void main(String[] args) {
        String input = "Ala to nie mila kobieta i nie wiadomo jaka mogla by byc.";
        char space = ' ';
        int value = calculateSpacesInString(input, space);
        float calculatePercent = calculatePercentSpacesInString(value,input.length());
        System.out.println("Amount of spaces in input text: " + value);
        System.out.println("Percent of spaces in whole text length : " + calculatePercent);



    }

    private static int calculateSpacesInString(String text, char space) {
        int counter = 0;
        String spaceChar = Character.toString(space);
        if (text.contains(spaceChar) && StringValidator.isValidString(text)) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == space) {
                    counter++;
                }
            }
        }
        return counter;
    }
    private static float calculatePercentSpacesInString (float amountSpaces, int textLength){
        return (amountSpaces / textLength) * 100;
    }
}
