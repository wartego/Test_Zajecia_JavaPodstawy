package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z2_ProgramBMI {
    public static void main (String[] args) {
        while (true) {
            Scanner input_waga = new Scanner(System.in);
                System.out.println("\n Podaj wage w kg");
        double waga = input_waga.nextDouble();
            Scanner input_wzrost = new Scanner(System.in);
            System.out.println("Podaj wzrost w cm");
        double wzrost = input_wzrost.nextDouble();
        double wzrost_metry = wzrost / 100;
        double bmi = waga / (wzrost_metry * wzrost_metry);


            System.out.println("Twoje BMI to: " + bmi);
        if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Twoje BMI jest optymalne");
        } else {
            System.out.println("Twoje BMI jest nieoptymalne");
        }
    }
   }
    }

