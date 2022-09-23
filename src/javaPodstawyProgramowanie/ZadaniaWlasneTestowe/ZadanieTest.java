package javaPodstawyProgramowanie.ZadaniaWlasneTestowe;

import java.util.Scanner;

public class ZadanieTest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
getChangedSequance(getKeyFromUser());
    }
    private static void getChangedSequance(String tempKEY) {
        while (true) {
            char[] tempDigit = tempKEY.toCharArray();
            System.out.println("Changed sequence : \n --> " + tempDigit[30] + "" + tempDigit[31] + tempDigit[28] + "" + tempDigit[29] + "" + tempDigit[26] + "" + tempDigit[27] + "" + tempDigit[24] + "" + tempDigit[25] + "" + tempDigit[22] + "" + tempDigit[23] + "" + tempDigit[20] + "" + tempDigit[21] + "" + tempDigit[18] + "" + tempDigit[19] + "" + tempDigit[16] + "" + tempDigit[17] + "" + tempDigit[14] + "" + tempDigit[15] + "" + tempDigit[12] + "" + tempDigit[13] + "" + tempDigit[10] + "" + tempDigit[11] + "" + tempDigit[8] + "" + tempDigit[9] + "" + tempDigit[6] + "" + tempDigit[7] + "" + tempDigit[4] + "" + tempDigit[5] + "" + tempDigit[2] + "" + tempDigit[3] + "" + tempDigit[0] + "" + tempDigit[1] + "");
            System.out.println("");
            getChangedSequance(getKeyFromUser());
        }
    }
    private static String getKeyFromUser(){
        System.out.println("Please provide KEY (32digits): ");
        String tempKEY = input.nextLine();
      return tempKEY;
    }
}
