package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z5_LiczbyPierwsze {
    public static void main(String[] args) {
        System.out.println("Program wypisuje liczbe pierwszy z zakresu od 1 do liczba");
        System.out.println("Podaj wartosc liczba: ");
        Scanner input = new Scanner(System.in);
        String status = "x";
        int liczba = input.nextInt();

        for (int i = 1; i <= liczba; i++) {
            for (int j = 1; j < i; j++) {
                if (j==1){
                    status = " Pierwsza";
                }else if(i % j == 0) {
                    status = " Nie";
                    break;
                } else {
                    status = " Pierwsza";
                }
            }
            if (i==1){
                status = " Pierwsza";
            }
            System.out.println(i + status);
        }

    }
}

