package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z8_Kalkulator {
    public static void main(String[] args) {
        float wynik = 0;
        System.out.println("Wprowadź pierwsza liczbe do obliczeń: ");
        Scanner input = new Scanner(System.in);
        float liczba1 = input.nextFloat();

        System.out.println("Wprowadź druga liczbe do obliczeń: ");
        float liczba2 = input.nextFloat();

        System.out.println("Wprowadź działanie na liczbach jakie chcesz wykonać: + - / * ");
        input.nextLine();
        String dzialanie = input.nextLine();

//        if (!Pattern.matches("[0-9]+", String.valueOf(liczba1))) {
//            System.out.println("poprawna liczna");
//        } else System.out.println("Litera");
        switch (dzialanie) {
            case "+":
                wynik = liczba1 + liczba2;
                System.out.println("Wynik dzialania:  " + liczba1 + " " + dzialanie + " " + liczba2 + " = " + wynik);
                break;
            case "-":
                wynik = liczba1 - liczba2;
                System.out.println("Wynik dzialania:  " + liczba1 + " " + dzialanie + " " + liczba2 + " = " + wynik);
                break;
            case "/":
                if (liczba2 == 0) {
                    System.out.println("nie mozna dzielic przez zero");
                    break;
                }
                wynik = liczba1 / liczba2;
                System.out.println("Wynik dzialania:  " + liczba1 + " " + dzialanie + " " + liczba2 + " = " + wynik);
                break;
            case "*":
                wynik = liczba1 * liczba2;
                System.out.println("Wynik dzialania:  " + liczba1 + " " + dzialanie + " " + liczba2 + " = " + wynik);
                break;
            default:
                System.out.println("Błędny znak działania został wprowadzony");
                break;
        }
        input.close();
    }
}
