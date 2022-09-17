package javaPodstawyProgramowanie.programyZajeciaDzien1;

import java.util.Scanner;

public class Z5_DodawanieLiczbOdXdoY {

    //  private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int firstDigit = 11;
        int secondDigit = 4;
        int sum = sumOfTheSequence(firstDigit, secondDigit);
        int sumB = sumOfTheSequenceB(firstDigit, secondDigit);
        int sumC = sumOfTheSequenceC(firstDigit, secondDigit);

        System.out.println("Sum for: " + sum);
        System.out.println("Sum while: " + sumB);
        System.out.println("Sum do while: " + sumC);
    }

    private static int sumOfTheSequence(int firstDigit, int secondDigit) {

        int countValue = 0;
        for (int i = firstDigit; i <= secondDigit; i++) {
            countValue += i;
        }
        return countValue;
    }

    private static int sumOfTheSequenceB(int firstDigit, int secondDigit) {
        int countValue = 0;
        while (firstDigit <= secondDigit) {
            countValue += firstDigit;
            firstDigit++;
        }
        return countValue;

    }

    private static int sumOfTheSequenceC(int firstDigit, int secondDigit) {

        int start = firstDigit;
        int stop = secondDigit;
        if (firstDigit > secondDigit) {
            start = secondDigit;
            stop = firstDigit;
        }


        int i = start;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= stop);
        return sum;


    }

}