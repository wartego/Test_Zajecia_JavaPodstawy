package javaPodstawyProgramowanie.ZadaniaWlasneTestowe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatyPrzyklad {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(1900,01,01);
        LocalDate date3 = LocalDate.parse("1900-01-01", DateTimeFormatter.ISO_DATE);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}
