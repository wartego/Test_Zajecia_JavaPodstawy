package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z12_IloscSpacjiTekst {

    public static void main(String[] args) {
        System.out.println("Wprowadz słowo z spacja: ");
        Scanner input = new Scanner(System.in);
        String tekst = input.nextLine();
        String tekstTrim = tekst.trim();
        double count = 0d;

        char[] tablica = tekstTrim.toCharArray();
        for(int i=0; i<tablica.length ;i++){
            if (tablica[i] == ' '){
                System.out.print("Spacja");
                count++;
            }
            System.out.println(tablica[i]);
        }
        System.out.println("Procent spacji w calym tekscie: " +((count / tablica.length)*100) + " %." );
    }
}
