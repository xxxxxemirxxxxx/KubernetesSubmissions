package com.example.logoutput;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;
import org.slf4j.Logger;

/**
 * Every N milliseconds (default 5000), logs the timestamp and the single random string.
 */
@Component
public class LogScheduler {

    private static final Logger log = LoggerFactory.getLogger(LogScheduler.class);
    private final RandomStringService randomStringService;

    public LogScheduler(RandomStringService randomStringService) {
        this.randomStringService = randomStringService;
    }

    @Scheduled(fixedRateString = "${app.log-interval-ms}", initialDelay = 0)
    public void logRandomString() {
        String timestamp = Instant.now().toString();
        log.info("{}: {}", timestamp, randomStringService.getRandomString());
    }

}
