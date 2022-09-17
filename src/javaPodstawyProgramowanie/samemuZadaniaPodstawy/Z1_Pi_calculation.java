package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;
public class Z1_Pi_calculation {

    public static void main(String[] args){
        CircumferenceCalculation();
    }

    private static void CircumferenceCalculation() {
        System.out.println("Podaj wartość srednicy okregu ");
        Scanner input = new Scanner(System.in);

        float srednica = input.nextFloat();

        float liczbapi = 3.14f;
        float obwod = liczbapi * srednica;
        System.out.println("Obliczona obwod okregu " + obwod);

        // Obliczenia za pomocą Math.PI
        float srednica2 = srednica;
        float obwod2 = (float) (Math.PI * srednica2);
        System.out.println("Obliczona obwod okregu z liczba Match.PI " + obwod2);
    }
}
