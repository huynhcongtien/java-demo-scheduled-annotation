package com.lampartvn.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class WriteCurrentTimeSchedule {

    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");

    @Scheduled(fixedDelay = 1000)
    public void writeCurrentTime() {
        Date   now       = new Date();
        String nowString = df.format(now);
        System.out.println("Now is:::: " + nowString);
    }

}
