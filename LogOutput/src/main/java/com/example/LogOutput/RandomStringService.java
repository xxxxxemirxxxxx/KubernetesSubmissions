package com.example.logoutput;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Generates a random string once (on bean construction) and keeps it in memory.
 */
@Service
public class RandomStringService {

    private final String randomString = UUID.randomUUID().toString();

    public String getRandomString() {
        return randomString;
    }
}
