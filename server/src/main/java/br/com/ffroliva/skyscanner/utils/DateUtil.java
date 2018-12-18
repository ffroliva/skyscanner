package br.com.ffroliva.skyscanner.utils;

import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

@Slf4j
public class DateUtil {

    public static LocalDate getNextMonday(){
        LocalDate ld = LocalDate.now();
        log.debug(String.format("Today: %s",ld));
        ld = ld.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        log.debug(String.format("Next Monday: %s",ld));
        return ld;
    }
}
