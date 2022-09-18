package javaPodstawyProgramowanie.programZajeciaDzien2;

public class Z5_StringCharacterEvents {
    public static void main(String[] args) {


        String input = "Ala ma kota";

        char searchedCharacter = ' ';
        System.out.println("Input: " + input);
        System.out.println("Searched character: " + searchedCharacter);
        System.out.println("Result: " + countCharInString(input, searchedCharacter));

//    searchedCharacter = 'z';
//        System.out.println("Input: " + input);
//        System.out.println("Searched character: " + searchedCharacter);
//        System.out.println("Result: " + countCharInString(input, searchedCharacter));
    }

    private static int countCharInString(String input, char searchedCharacter) {
        int counter = 0;
        if (StringValidator.isValidString(input) && input.contains(String.valueOf(searchedCharacter))) {
            for (int i = input.indexOf(searchedCharacter); i < input.length(); i++) {
                char characterTEMP = input.charAt(i);
                if (characterTEMP == searchedCharacter) {
                    counter++;
                }
            }
        }
        return counter;
    }
}