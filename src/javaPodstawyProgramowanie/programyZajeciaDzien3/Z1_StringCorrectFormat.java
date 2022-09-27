package javaPodstawyProgramowanie.programyZajeciaDzien3;

import java.util.regex.Pattern;

public class Z1_StringCorrectFormat {
    private static final String numberCorrectFormat = "-?[0-9]+(,[0-9]+)?";
    public static void main(String[] args) {
        System.out.println(isCorrectIBANNumber("1234,532"));
        System.out.println(isCorrectIBANNumber("124"));
        System.out.println(isCorrectIBANNumber("-124"));
        System.out.println(isCorrectIBANNumber("124,0"));
        System.out.println(isCorrectIBANNumber("1243243242"));
        System.out.println(isCorrectIBANNumber("0"));
        System.out.println(isCorrectIBANNumber("124,"));
        System.out.println(isCorrectIBANNumber("124,"));
        System.out.println(isCorrectIBANNumber("-124."));
        System.out.println(isCorrectIBANNumber("124."));
        System.out.println(isCorrectIBANNumber("124a2312"));
        System.out.println(isCorrectIBANNumber("012,23"));
        System.out.println(isCorrectIBANNumber("10,23"));


    }
    /*
    ? zero or one
    * zero or more
    + one or more
     */
    private static boolean isCorrectIBANNumber(String IBANNumber) {

        return Pattern.matches(numberCorrectFormat,IBANNumber);
    }
}