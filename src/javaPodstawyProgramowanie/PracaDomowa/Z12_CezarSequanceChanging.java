package javaPodstawyProgramowanie.PracaDomowa;

import java.util.Scanner;

public class Z12_CezarSequanceChanging {
    public static void main(String[] args) {
        String text = "bardzo lubie programowac";
        System.out.println("Result: " + getChangedSequance(text));
    }

    private static StringBuilder getChangedSequance(String text) {
        StringBuilder encryptedText = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert shift: ");
        int shift = input.nextInt();
        char tempChar = ' ';
        int tempINT = 0;
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (temp == 32) {
                tempINT = 32;
                tempChar = (char) tempINT;
            } else {
                tempINT = temp + shift; // char into Integer
                if (tempINT <= 122) {
                    tempChar = (char) tempINT;
                } else {
                    tempChar = (char) (tempINT - 26);
                }
            }
                encryptedText = encryptedText.append(tempChar);
            }
        return encryptedText;
        }
    }