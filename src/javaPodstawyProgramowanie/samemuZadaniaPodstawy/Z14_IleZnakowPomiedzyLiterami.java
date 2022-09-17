package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z14_IleZnakowPomiedzyLiterami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz pierwszy znak: ");
        char znak1 = input.next().trim().toLowerCase().charAt(0);

        System.out.println("Wprowadz drugi znak: ");
        char znak2 = input.next().trim().toLowerCase().charAt(0);

        int znak1A= (int) znak1;
        int znak2A= (int) znak2;
        System.out.println(znak1A);
        System.out.println(znak2A);

        int iloscZnakow = Math.abs(znak1A-znak2A) - 1 ;
        System.out.println("Liczba znakow pomiedzy literami wynosi: " + iloscZnakow);
    }
}
