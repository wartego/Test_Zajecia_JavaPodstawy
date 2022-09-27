package javaPodstawyProgramowanie.programyZajeciaDzien3;

import java.util.regex.Pattern;

public class Z1_IBANVALIDATIOn {
    private static final String IBAN_REGEX = "PL[0-9]{26}";
    public static void main(String[] args) {
        System.out.println(isCorrectIBANNumber("PL10105000997603123456789123"));
        System.out.println(isCorrectIBANNumber("ZL10105000997603123456789123"));
        System.out.println(isCorrectIBANNumber("PL1010500099760312345678912."));
        System.out.println(isCorrectIBANNumber("1234"));
    }
    /*
    ? zero or one
    * zero or more
    + one or more
     */
    private static boolean isCorrectIBANNumber(String IBANNumber) {

        return Pattern.matches(IBAN_REGEX,IBANNumber);
    }
}