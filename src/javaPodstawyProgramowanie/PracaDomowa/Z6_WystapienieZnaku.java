package javaPodstawyProgramowanie.PracaDomowa;

public class Z6_WystapienieZnaku {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char letter = 'x';
        System.out.println("Index : " + getIndexFromText(input, letter));
    }
    private static int getIndexFromText (String text, char lookedchar){
       int index = text.indexOf(lookedchar);

       if(lookedchar == ' '){
           return index = -1;
       }
        return index;
    }
}
