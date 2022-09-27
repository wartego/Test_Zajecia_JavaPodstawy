package javaPodstawyProgramowanie.programyZajeciaDzien3.Task7;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Mruczek");
        Cats cat2 = new Cats("Filemon");
        Cats cat3 = new Cats("Bonifacy");
        // tworzenie tablicy z trzech cat..
        Cats[] cats = {cat, cat2,cat3};
        int i = 2;

        // wyswietlanie elementow tablicy
        for(Cats x : cats){
            cat.print();
            cat.makeSound();
            cat.eatMice(i++ * i);
            System.out.println("***");
        }
    }
}
