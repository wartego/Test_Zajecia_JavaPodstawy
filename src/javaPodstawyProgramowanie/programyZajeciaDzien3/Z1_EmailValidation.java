package javaPodstawyProgramowanie.programyZajeciaDzien3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Z1_EmailValidation {
    private static final String EMAIL_REGEX = "[a-zA-Z0-9]+@[a-z]+(.[a-z]+)*";
    public static void main(String[] args) {
        System.out.println(isCorrectEmailFormat("paweldudko@outlook"));
        System.out.println(isCorrectEmailFormat("paweldudko@outlook.com"));
        System.out.println(isCorrectEmailFormat("paweldudko@outlook.com.pl"));
        System.out.println(isCorrectEmailFormat("paweldudko@outlook.com.pl.cosmtam."));
        System.out.println(isCorrectEmailFormat("paweldudko@outlook.com.pl.cosmtam"));
        System.out.println(isCorrectEmailFormat("paweldudko@.pl"));

    }
    /*
    musi byc malpa, jedna małpa
    duze, male litrery, cyfry -- > przed małpa
    małe litery --> po małpie

    xxx@outlook.pl
    xxx@outlook.com.pl
    xxx@outlook.com.pl.

    ? zero or one
    * zero or more
    + one or more
     */


    private static boolean isCorrectEmailFormat(String emailAddress) {

// Option #1
//        Pattern pattern = Pattern.compile("");
//        Matcher matcher = pattern.matcher(emailAddress);
//        return matcher.matches();

// Option #2
//  return Pattern.compile("").matcher(emailAddress).matches();

// Option #3
        return Pattern.matches(EMAIL_REGEX,emailAddress);
    }
}