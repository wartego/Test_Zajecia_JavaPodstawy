package javaPodstawyProgramowanie.programyZajeciaDzien3.Task8;

import java.util.Objects;

public class AuthorX {
    private String surname, natonality;

    public AuthorX(String surname, String natonality) {
        this.surname = surname;
        this.natonality = natonality;
    }

    public String getSurname() {
        return surname;
    }

    public void print(){
        System.out.println(this.toString());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthorX authorX = (AuthorX) o;
        return Objects.equals(surname, authorX.surname) && Objects.equals(natonality, authorX.natonality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, natonality);
    }

    @Override
    public String toString() {
        return "AuthorX{" +
                "surname='" + surname + '\'' +
                ", natonality='" + natonality + '\'' +
                '}';
    }
}
