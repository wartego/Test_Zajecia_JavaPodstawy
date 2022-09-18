package javaPodstawyProgramowanie.programZajeciaDzien2;

import java.util.regex.Pattern;

public class Z11_Palindrom {
    public static void main(String[] args) {
        String input = "kkajakk";
        System.out.println("Result : " + checkIfItPalindrom(input));

    }
    private static boolean checkIfItPalindrom(String input){
        if(StringValidator.isValidString(input)){
            String reverseInput = new StringBuilder((input)).reverse().toString();
            return input.equalsIgnoreCase(reverseInput);
        }
        return false;
    }
}
