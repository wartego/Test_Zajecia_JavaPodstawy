package javaPodstawyProgramowanie.programZajeciaDzien2;

public class Z3_StringIfExistingInInput {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "mi";
        System.out.println("Result : " + getPosition(input, word));
        //System.out.println(input.indexOf(word)); // --> zwroci pozycje danego wyrazu, a gdy go nie znajdzie to zwroci -1
    }

    public static int getPosition(String input, String word) {
        if (StringValidator.isValidString(input) && StringValidator.isValidString(word)) {
            return input.indexOf(word);
        }
        // boolean check = input.contains(word); --> sprawdza czy wyraz znajduje sie w zlowie i zwraca true lub false
        return -1;
    }
}
