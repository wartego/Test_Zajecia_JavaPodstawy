package javaPodstawyProgramowanie.programZajeciaDzien2;

public class Z14_LicznyUjemneIDodatnie {
    private static final int[] input = {12, -7, 19, -5, -99};

    public static void main(String[] args) {
        System.out.println("New table value: ");
        printNewTable();
    }

    private static int getAmountofNegativeNumbers(int[] input) {
        int counter = 0;
        for (int temp : input) {
            if (temp < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createTableandaddValue(int[] input, int counter) {
        int[] table = new int[counter];
        int newTabCounter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                table[newTabCounter] = input[i];
                newTabCounter++;
            }
        }
        return table;
    }

    private static void printNewTable() {
        for (int i : createTableandaddValue(input, getAmountofNegativeNumbers(input))) {
            System.out.print(i + " ");
        }

    }
}