package com.lampartvn.job;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyJob {

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        System.out.println("Task1 - " + new Date());
    }

    @Scheduled(fixedRate = 2000)
    public void scheduleFixedRateTask() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Task2 - " + new Date());
    }

    @Scheduled(cron = "*/3 * * * * *")
    public void scheduleTaskUsingCronExpression() {
        System.out.println("Task3 - " + new Date());
    }

}
