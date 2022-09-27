package javaPodstawyProgramowanie.programyZajeciaDzien3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Z5_TimmingBeetwenEnterPress {
    public static void main(String[] args) {
TimeBeetwen();
    }

    private static void TimeBeetwen() {
        Scanner input = new Scanner(System.in);
        System.out.println("To start timing press ENTER");
        input.nextLine();
        LocalTime startTime = LocalTime.now();

        System.out.println("To stop timing press ENTER");
        input.nextLine();
        LocalTime endTime = LocalTime.now();

        Duration duration = Duration.between(startTime,endTime);
        System.out.println("Total time: " + duration.toMinutes() + " minutes " +duration.getSeconds() + " seconds "+ duration.getNano() + " nano seconds");

    }
}