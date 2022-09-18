package javaPodstawyProgramowanie.programyZajeciaDzien1;

import java.util.Scanner;

public class Z6_TabliczkaMnozenia {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int multiplier = getMultiplier();
        int minMultiplicand = getMinMultiplicand();
        int maxMultiplicand = getMaxMuliplicand();
     printMulipicationTable(multiplier,minMultiplicand,maxMultiplicand);


    }
    private static int getMultiplier(){

        System.out.print("Please insert Multiplier: ");
        return input.nextInt();
    }
    private static int getMinMultiplicand(){

        System.out.print("Please insert MIN Multiplicand: ");
        return input.nextInt();
    }
    private static int getMaxMuliplicand(){

        System.out.print("Please insert Max Multiplicand: ");
        return input.nextInt();
    }
    private static void printMulipicationTable(int multiplier, int minMultiplicand, int maxMuliplicand){
        int count = minMultiplicand;
        int value = 0;
        for ( int i = count ; count <= maxMuliplicand ; count++ ){
            value = multiplier * count;
            System.out.println( multiplier + " * " + count+ " = " +  value);
        }
    }

}
