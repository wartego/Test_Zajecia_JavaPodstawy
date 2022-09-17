package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z4_PifPaf {
    public static void main(String[] args) {
        System.out.println("Program wypisuje wartosc liczby od 1 do liczba");
        System.out.println("Wprowadz wartosc liczby (wartosc dodatnia)");
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        int i;
        System.out.println("Liczba wpisana to: " + liczba);
        for (i = 1 ; i <= liczba ; i++){
            if(i%3==0 && i%7==0){
                System.out.println("Pif Paf");
            }else if(i%7==0){
                System.out.println("Paf");
            }else if(i%3==0){
                System.out.println("Pif");
            } else{
                System.out.println(i);
            }
        }
    }
}
