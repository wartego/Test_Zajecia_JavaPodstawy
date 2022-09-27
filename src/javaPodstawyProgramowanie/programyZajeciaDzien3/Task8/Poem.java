package javaPodstawyProgramowanie.programyZajeciaDzien3.Task8;

import java.util.Objects;

public class Poem {
 private AuthorX creator;
 private int stropheNumbers;

    public Poem(AuthorX creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }
    public void print(){
        System.out.println(this.toString());
    }

    public AuthorX getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poem poem = (Poem) o;
        return stropheNumbers == poem.stropheNumbers && Objects.equals(creator, poem.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator, stropheNumbers);
    }

    @Override
    public String toString() {
        return "Poem{" +
                "creator=" + creator +
                ", stropheNumbers=" + stropheNumbers +
                '}';
    }
}
