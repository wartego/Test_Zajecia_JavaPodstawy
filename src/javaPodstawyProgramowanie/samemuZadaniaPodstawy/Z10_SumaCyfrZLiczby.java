package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z10_SumaCyfrZLiczby {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        /**  String.valueOf(liczba) - zmienia int na Stringa */
        String liczbaKonwert = String.valueOf(liczba);

        char[] tablica = liczbaKonwert.toCharArray();
        int wynik = 0;

        for (int i=0;i<tablica.length;i++){

            /**  Character.getNumericValue - zmienia znak char na wartosc liczbowa int */
        // w tym przykladznie nie jest to potrzebne to tablica i tak wyswietli wartosc numeryczna nie kod znaku char
          int dodaj = Character.getNumericValue(tablica[i]);

            //System.out.println("Wynik dodaj " +i+" to " + dodaj);
           wynik = wynik + dodaj;
           // System.out.println("Wynik " +i+" to " + wynik);
        }

        System.out.println("Wynik dodania cyfr z liczby " +liczbaKonwert+" to " + wynik);
        System.out.println(tablica[0]);
    }
}
