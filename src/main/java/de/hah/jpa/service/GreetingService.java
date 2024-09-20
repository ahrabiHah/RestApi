package de.hah.jpa.service;


import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingService implements IGreenings{


    @Override
    public String generateGreeting(String name) {
        LocalTime time = LocalTime.now();  // Get the current time
        int hour = time.getHour();  // Get the current hour

        // Adjust greeting based on time of day
        if (hour < 12) {
            return "Good morning, " + name;
        } else if (hour == 12) {
            return "Good noon, " + name;
        } else if (hour < 18) {
            return "Good afternoon, " + name;
        } else if (hour < 22) {
            return "Good evening, " + name;
        } else {
            return "Good night, " + name;
        }
    }

}
