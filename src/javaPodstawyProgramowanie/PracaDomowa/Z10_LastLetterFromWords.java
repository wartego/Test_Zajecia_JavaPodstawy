package javaPodstawyProgramowanie.PracaDomowa;

import javaPodstawyProgramowanie.programZajeciaDzien2.StringValidator;

import java.util.Scanner;

public class Z10_LastLetterFromWords {
    public static void main(String[] args) {
        System.out.println("Please input how many word you want to input: ");

        System.out.println("Result: " + getLastLetterFromEachText(createTablefromAllTexts()));
    }
    private static String[] createTablefromAllTexts(){
        Scanner input = new Scanner(System.in);
        int wordsAmount = input.nextInt();
        input.nextLine();
        String[] wordsTable = new String[wordsAmount];
        for(int i = 0; i <wordsAmount;i++){
            String tempValue =" ";
            while (StringValidator.isValidString(tempValue) == false) {
                System.out.print("Input next line: ");
                tempValue = input.nextLine();
            }
            wordsTable[i] = tempValue;
        }
        input.close();
return wordsTable;
    }
private static String getLastLetterFromEachText (String[] wordsTable){
        StringBuilder textWhole = new StringBuilder();
        char tempWord = ' ';
    for (int i = 0; i< wordsTable.length;i++){
        int tempIndex = wordsTable[i].length();
        tempWord = wordsTable[i].charAt(tempIndex-1);
       textWhole = textWhole.append(tempWord);
    }
    return textWhole.toString();
    }
}
