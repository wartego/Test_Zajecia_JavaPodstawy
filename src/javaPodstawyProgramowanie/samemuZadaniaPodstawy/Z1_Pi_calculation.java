package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;
public class Z1_Pi_calculation {

    public static void main(String[] args){
        System.out.println("Podaj wartość srednicy okregu ");
        Scanner input = new Scanner(System.in);
//        double srednica = input.nextDouble();
//
//       double liczbapi = 3.14;

        float srednica = input.nextFloat();

        float liczbapi = 3.14f;
        float obwod = liczbapi * srednica;
        System.out.println("Obliczona obwod okregu " + obwod);

        // Obliczenia za pomocą Math.PI
        double srednica2 = (double)srednica        ;
        double obwod2 = Math.PI * srednica2;
        System.out.println("Obliczona obwod okregu z liczba Match.PI " + obwod);
    }
}
