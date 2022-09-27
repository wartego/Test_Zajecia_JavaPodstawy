package javaPodstawyProgramowanie.programyZajeciaDzien3.Task7;

import java.util.Objects;

public class Cats {
private String name;

    //konstruktor
    // Czym sie rozni konstruktor od zwyklej metody? --> Konsturktor nic nie zwraca.
    public Cats(String name) {
        this.name = name;
    }



    public void makeSound(){
        System.out.println("Miau miau");
    }
    public void eatMice(int mice){
        System.out.println("I ate " + mice + " mice.");
    }
    public void print(){
        //oba ponizsze zapisy sa rownowazne
        System.out.println(this.toString());
       // System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats z7_cat = (Cats) o;
        return Objects.equals(name, z7_cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Z7_Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
