package com.company;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {

        LocalTime czasLokalny = LocalTime.now()
                .truncatedTo(ChronoUnit.SECONDS);
        LocalTime czasGlobalny = LocalTime.now(ZoneId.of("GMT"))
                .truncatedTo(ChronoUnit.SECONDS);

        System.out.println(czasLokalny);
        System.out.println(czasGlobalny);

    }
}
