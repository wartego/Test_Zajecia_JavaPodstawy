package javaPodstawyProgramowanie.programyZajeciaDzien3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Z6_DateBeetwenSelectedDate {
private static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        getDaysBeetwenPeriod();

    }
    private static void getDaysBeetwenPeriod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide date your next lesson  " + INPUT_DATE_FORMAT);
        String nextLesson = input.nextLine();
// konwertujemy input na LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);
        LocalDateTime nextLessonDate  = LocalDateTime.parse(nextLesson,formatter);
//wyliczamy ile dni do nastepnych zajec
        LocalDateTime startTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime,nextLessonDate);

       long days = duration.toDays();
       long hours = duration.toHoursPart();
       long minutes = duration.toMinutesPart();
       long seconds = duration.toSecondsPart();

        System.out.println(" You have " + days + " days " + hours + " houres " + minutes + " minutes " + seconds + " seconds " + " days to next lesson.");
        System.out.printf(" You have days: %02d Hours: %01d Minutes: %01d Secs: %01d", days,hours,minutes,seconds);

    }
}
