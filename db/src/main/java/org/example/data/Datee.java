package org.example.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datee {
    public static void main(String[] args) {
        //date ==yyyy-mm-dd
        LocalDate data=LocalDate.now();
        System.out.println(data);

        //time== hh-mm-ss-ns
        LocalTime time= LocalTime.now();
        System.out.println(time);

        //datadhe ora==yyyy-MM-dd-HH-mm-ss-ns
        LocalDateTime datatime=LocalDateTime.now();
        System.out.println(datatime);
        DateTimeFormatter formatdate=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String dateee= datatime.format(formatdate);
        System.out.println(dateee);
    }
}
