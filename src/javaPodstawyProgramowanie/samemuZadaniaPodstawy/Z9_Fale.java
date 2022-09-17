package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z9_Fale {

    public static void main(String[] args) {
        System.out.println("Podaj ile fal chcesz uzyskac");
        Scanner input = new Scanner(System.in);
        int ileFal = input.nextInt();
        for(int i=0;i<ileFal;i++){
            if(i==ileFal-1){
                System.out.println("*      *");
            } else {
                System.out.print("*      *     ");
            }
        }

        for(int j=0;j<ileFal;j++){
            if(j==ileFal-1){
                System.out.println(" *    *");
            } else {
                System.out.print(" *    *      ");
            }
        }
        for(int k=0;k<ileFal;k++){
            if(k==ileFal-1){
                System.out.println("  *  *");
            } else {
                System.out.print("  *  *       ");
            }
        }
        for(int l=0;l<ileFal;l++){
            if(l==ileFal-1){
                System.out.println("   **");
            } else {
                System.out.print("   **        ");
            }
        }

    }
}
