package javaPodstawyProgramowanie.samemuZadaniaPodstawy;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Z17_LiczbaDniPomiedzyDatami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj date z przyszlosci, system wyliczy liczbe dni od dzisiaj w formie 2022-08-29: ");
        String data = input.nextLine();
        LocalDate localDatenow = LocalDate.now(); // data dzisiejsza

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // przekazanie Stringa na format daty
        LocalDate dataX = LocalDate.parse(data, formatter);

        System.out.println(Period.between(localDatenow, dataX).getDays());

        // druga wersja
//Period period = Period.between(localDatenow,dataX);
//int period2 = period.getDays();
//        System.out.println("Liczba dni to: " + period);



        System.out.println("Liczba dni pomiedzy: " + dataX + " i " +localDatenow + " to: ");
    //System.out.println(Math.abs(ChronoUnit.DAYS.between(dataX , localDatenow))); // oblicza liczbe dni pomiedzy datami

    }
}
