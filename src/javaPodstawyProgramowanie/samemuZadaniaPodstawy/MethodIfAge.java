package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class MethodIfAge {

    static int myMethod(int age){
        if (age < 18){
            System.out.println("Jesteś niepełnoletni" + age);
        } else {
            System.out.println("Jesteś pełnoletni" + age);
        }

        return age;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz wiek: ");
        int wiek = input.nextInt();
        myMethod(wiek);
    }
}
