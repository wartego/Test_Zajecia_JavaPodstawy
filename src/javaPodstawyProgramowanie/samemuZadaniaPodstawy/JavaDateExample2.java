package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JavaDateExample2 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");

        String date = "2022-08-21";

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println(localDate);  //default, print ISO_LOCAL_DATE

        System.out.println(formatter.format(localDate)); // print formatter date

    }
}