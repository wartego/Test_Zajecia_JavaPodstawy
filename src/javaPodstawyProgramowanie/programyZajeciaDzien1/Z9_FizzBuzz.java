package javaPodstawyProgramowanie.programyZajeciaDzien1;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Z9_FizzBuzz {


    public static void main(String[] args) {

        for (int i = 1; i <= 20 ; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    private static String fizzBuzz(int number) {
    if (number % 3 == 0 && number % 5 == 0){
    return "FizzBuzz";
    } else if (number % 3 == 0 ) {
        return "Fizz";
    }else if (number % 5 == 0) {
        return "Buzz";
    }
    return String.valueOf(number);
    }
}