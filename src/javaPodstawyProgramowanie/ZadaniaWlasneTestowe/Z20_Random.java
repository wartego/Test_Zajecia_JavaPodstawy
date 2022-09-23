package javaPodstawyProgramowanie.ZadaniaWlasneTestowe;

import java.util.Random;
import java.util.Scanner;


public class Z20_Random {
    static Scanner input = new Scanner(System.in);
    static  Random randomValue = new Random();
    static boolean iftrue = true;
    public static void main(String[] args) {
        checkValues(getRandomValue());
    }
    private static int getRandomValue(){
       int randomInt = randomValue.nextInt(0,10);
           return randomInt;
    }
    private static void checkValues(int randomInt){

        while(iftrue) {
            System.out.print("Please provide your value from 0 to 100: ");
            int intFromUser = input.nextInt();
            if (intFromUser == randomInt) {
                System.out.println("Bingo");
                iftrue = false;
                input.close();
            } else if (intFromUser > randomInt) {
                System.out.println(" too high");
            } else System.out.println("too low");
            System.out.println("Random int by computer is: " + randomInt + "\n");
            checkValues(getRandomValue());
        }
    }
}
