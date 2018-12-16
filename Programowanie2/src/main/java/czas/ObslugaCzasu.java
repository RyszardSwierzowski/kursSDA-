package czas;

import java.lang.reflect.Array;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class ObslugaCzasu {


    /**
     * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#patterns
     */


    public static void main(String[] args) {
         /*
       OBSŁUGA SAMEJ DATY
        */

        LocalDate now = LocalDate.now(); //Pobierz bierzącą date
        System.out.println(now);

        //Tworzy datę na podstawie liczb (rok, miesiąc, dzień)
        LocalDate anotherDate = LocalDate.of(2015, 2, 1);
        //Tworzy datę na podstawie String YYYY-MM-DD
        LocalDate anotherDate2 = LocalDate.parse("2015-02-20");

        //Dodaje jeden dzień do bieżącej daty
        LocalDate tomorrow = now.plus(1L, ChronoUnit.DAYS);
//        LocalDate tomorrow = now.plusDays(1);

        //Odejmuje jeden dzień od bieżącej daty
        LocalDate yesterday = now.minusDays(1);

        //Pobiera dzień tygodnia dla bieżącej daty
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int dayOfWeekAsNumber = dayOfWeek.getValue();

        //Sprawdza czy rok jest przestępny
        boolean isLeapYear = now.isLeapYear();

        //Sprawdcz czy data 'tomorrow' jest po dacie 'now'
        boolean isTomorrowAfterNow = tomorrow.isAfter(now);

       /*
       OBSŁUGA SAMEGO CZASU
        */
        //Tworzy bieżacą godzinę
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        //Tworzy godzinę na podstawie liczb
        LocalTime anotherTime = LocalTime.of(15, 20);
        LocalTime anotherTime2 = LocalTime.parse("15:20");

        //Dodaje jedną godzinę do bieżącej
        LocalTime oneHourLater = timeNow.plus(1, ChronoUnit.HOURS);
        LocalTime oneHourLater2 = timeNow.plusHours(1);

        //pobiera godzinę w postaci liczby
        int hour = timeNow.getHour();

        //Pobieramy max godzinę, tj. 23:59:59.999
        LocalTime maxTime = LocalTime.MAX;

       /*
       OBSŁUGA PEŁNEGO CZASU (DATA + CZAS)
        */
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
        LocalDateTime anotherDateTime
                = LocalDateTime.of(2017, 2, 3, 6, 0);
        LocalDateTime anotherDateTime2
                = LocalDateTime.parse("2015-02-20T06:30:00");

        nowDateTime.plus(1, ChronoUnit.DAYS);
//        nowDateTime.plusDays(1);

       /*
       Tworzenie czasu ze stringa
        */
        //Data do przekonwertowania
        String str = "12-03-1991 06:07";

        //Tworzymy format w jakim będzie podawany czas
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        //Otworzymy datę dla zmiennej 'str'
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

        System.out.println(dateTime);


       /*
       Tworzenie stringa z czasu
        */
        //Tworzymy format w jakim chcemy wyświetlić datę
        DateTimeFormatter dtf
                = DateTimeFormatter.ofPattern("yy MM dd HH:mm");

        //Konwertujemy datę do stringa i go wyświetlamy :slightly_smiling_face:
        String nowDateTimeAsString = nowDateTime.format(dtf);
        System.out.println(nowDateTimeAsString);


    /*
            TIMESTAMP
     */
        long myTimeStamp = 1544862473L;

        LocalDateTime myLocalDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(myTimeStamp), TimeZone.getDefault().toZoneId());
        System.out.println(myLocalDateTime);


    /*
            STREFY CZASOWE
     */

        //AKTUALNA STREFA CZASOWA
        TimeZone myTimeZone = TimeZone.getDefault();
        System.out.println(myTimeZone.toZoneId()); //id  strefy
        System.out.println(myTimeZone.getRawOffset()); // przesuniecie od strefy +0

        ZoneId zoneID = ZoneId.of("Europe/Paris");
        System.out.println(zoneID.getRules().getOffset(Instant.EPOCH));// przesuniecie dla strefy Europa/Paris względem strefy +0


        Set<String> allZonesId = ZoneId.getAvailableZoneIds();


//        allZonesId.stream()
//                .forEach(x-> System.out.println(x+" "+ZoneId.of(x.toString()).getRules().getOffset(Instant.EPOCH))
//        );

        Map<String , Set<String>> mapaStref = new HashMap<>();
        for( String x : allZonesId)
        {
            if(mapaStref.containsKey(x))
            {
                Set<String> temp =mapaStref.get(x);
                temp.add(ZoneId.of(x).getRules().getOffset(Instant.EPOCH).toString());
               mapaStref.put(x ,temp);
            }else{
                Set<String> temp= new HashSet<>();
                temp.add(ZoneId.of(x).getRules().getOffset(Instant.EPOCH).toString());
                mapaStref.put(x,temp);
            }
        }

        mapaStref.entrySet().stream()
                .forEach(System.out::println);




    }



}
