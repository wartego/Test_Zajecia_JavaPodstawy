package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.util.Scanner;

public class Z6_SzeregHarmoniczny {
    public static void main(String[] args) {
        System.out.println("Wprowadz liczbe N - Szereg harmoniczny");
        Scanner input = new Scanner(System.in);
        int liczbaN = input.nextInt();

        double szereg = 1;
        float ulamek = 0.0f;

        for(int i=2;i<=liczbaN;i++){
ulamek = ulamek+ 1f/i;
        }
        System.out.println(ulamek+szereg);
    }
}
