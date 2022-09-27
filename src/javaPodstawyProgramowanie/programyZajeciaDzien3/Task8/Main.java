package javaPodstawyProgramowanie.programyZajeciaDzien3.Task8;

public class Main {
    public static void main(String[] args) {
        AuthorX author1 = new AuthorX("Chotomska","PL");
        AuthorX author2 = new AuthorX("Marcinkiewicz", "DE" );
        AuthorX author3 = new AuthorX("Czeczeczko","DK");
        // tworzenie tablicy z trzech authorow..


        Poem poem1 = new Poem(author1,100);
        Poem poem2 = new Poem(author2,43);
        Poem poem3 = new Poem(author3,86);

        //Poem[] poems = new Poem[3];
        // poems[0] = new Poem(author1,100); // tak tez mozna implementowac tablice

        Poem[] poems = { poem1,poem2,poem3};
    }
    private static String getSurnameWithMaxStropheNumbers(Poem[] poems){
        int tempMax = 0;
        String surnameMax = null;
        for(Poem poem: poems){
            int currentStropheNumber = poem.getStropheNumbers();
            if( tempMax < currentStropheNumber) {
                tempMax = currentStropheNumber;
             surnameMax = poem.getCreator().getSurname();
            }
        }
        return surnameMax;
    }


}
