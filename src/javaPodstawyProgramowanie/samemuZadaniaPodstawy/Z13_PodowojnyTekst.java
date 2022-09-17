package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Arrays;
import java.util.Scanner;

public class Z13_PodowojnyTekst {
    public static void main(String[] args) {
        System.out.println("Wprowadz słowo z spacja: ");
        Scanner input = new Scanner(System.in);
        String tekst = input.nextLine();
        String tekstTrim = tekst.trim();
        double count = 0d;

        String[] splitText = tekstTrim.split(" ");

        String[] tablicacopy = Arrays.copyOf(splitText, splitText.length); // kopiowanie tablicy splitText w nową taka samą o nazwie tablicacopy
        for (int i = 0; i < splitText.length; i++) {
            System.out.print(splitText[i] + " ");
            System.out.print(tablicacopy[i] + " ");
        }
    }
}

