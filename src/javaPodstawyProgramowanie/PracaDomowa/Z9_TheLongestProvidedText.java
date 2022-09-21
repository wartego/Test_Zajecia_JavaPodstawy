package javaPodstawyProgramowanie.PracaDomowa;

import javaPodstawyProgramowanie.programZajeciaDzien2.StringValidator;

import java.util.Objects;
import java.util.Scanner;

public class Z9_TheLongestProvidedText {
    public static void main(String[] args) {
        String stopText = "Enough";
        String result = theLongestText(stopText);
        System.out.println("The longest word is: "+ result);
    }
    private static String theLongestText (String stopText){
        Scanner input = new Scanner(System.in);
        String tempText = null;
        String longestText = "";
        do {
            System.out.print("Wprowadz nowy tekst: ");
            tempText = input.nextLine();
            if (StringValidator.isValidString(tempText)){
                if(tempText == stopText){
                    return longestText;
                }
                if (tempText.length() > longestText.length()){
                longestText = tempText;
                }
            } else {
                System.out.println("No input ");
            }
        } while (!Objects.equals(stopText,tempText));
        return longestText;
    }
}
