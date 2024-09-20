package de.hah.jpa.javaApiApp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class LunchApp {


    public static void main(String[] args) throws JsonProcessingException {
        Alien a = new Alien(1, "Hesham", "Ahrabi");
        Alien a1 = new Alien(2, "Hesham", "Ahrabi");
        Alien a2 = new Alien(3, "Hesham", "Ahrabi");

        Iterable<Alien> aliens= Arrays.asList(a,a1,a2);
        ObjectMapper om = new ObjectMapper();
        aliens.forEach(as-> {
            try {
                om.writeValueAsString(as);
                System.out.println(as);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });

    }
}
