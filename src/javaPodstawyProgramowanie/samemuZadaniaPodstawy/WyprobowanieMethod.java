package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class WyprobowanieMethod {
    static int myMethod(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartosc x: ");
        int liczbax = input.nextInt();
        System.out.println("Podaj wartosc y: ");
        int liczbay = input.nextInt();

        System.out.println("Wartosc dodawania to: " + myMethod(liczbax, liczbay));
    }
}
