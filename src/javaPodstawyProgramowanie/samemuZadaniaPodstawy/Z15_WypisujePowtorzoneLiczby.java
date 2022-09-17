package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Z15_WypisujePowtorzoneLiczby {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz 10 liczb");
        System.out.println("################");
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Wprowadz " + i + " liczbe: ");
            int wprowadzonaLiczba = input.nextInt();
            lista.add(wprowadzonaLiczba);
        }
        Collections.sort(lista); // sortowanie ArrayList
        System.out.println(lista);
        System.out.println(lista.size());

        for (int j = 0; j < lista.size(); j++) {
            if (j == 0) continue;
            if (j == 1) {
                if (lista.get(j - 1) == lista.get(j)) {
                    System.out.println(lista.get(j - 1) + " i " + lista.get(j) + " są takie same. ");
                    continue;
                }
            }

                if (lista.get(j - 1) == lista.get(j) && lista.get(j - 2) == lista.get(j - 1)) {
                    System.out.println(lista.get(j) + " kolejne powtorzenie ");
                } else if (lista.get(j - 1) == lista.get(j)) {
                    System.out.println(lista.get(j - 1) + " i " + lista.get(j) + " są takie same. ");
                }

            }
        }

    }

