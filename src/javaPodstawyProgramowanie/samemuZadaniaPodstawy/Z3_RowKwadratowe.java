package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z3_RowKwadratowe {
    public static void main(String[] args) {
        int a, b, c;

            System.out.println("Wprowadz liczbe a, b, c");
            Scanner input = new Scanner(System.in);
//            Scanner input2 = new Scanner(System.in);
//            Scanner input3 = new Scanner(System.in);
            int liczba_a = input.nextInt();
            int liczba_b = input.nextInt();
            int liczba_c = input.nextInt();
            double delta = Math.pow(liczba_b,2) - (4 * liczba_a * liczba_c);

                    double x1 = (-liczba_b - Math.sqrt(delta))/(2*liczba_a);
                    double x2 = (-liczba_b + Math.sqrt(delta))/(2*liczba_a);
            if (delta<0){
                System.out.println("Delta ujemna");
                System.out.println("Delta =" + delta);

            } else {
                System.out.println("liczba X1 = " + x1);
                System.out.println("liczba X2 = " + x2);
            }





        }


    }

