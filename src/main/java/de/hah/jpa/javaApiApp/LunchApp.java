package de.hah.jpa.javaApiApp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class LunchApp {


    public static void main(String[] args) throws IOException {
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


        InputStream inputStream = LunchApp.class.getClassLoader().getResourceAsStream("json/sample.json");
        if (inputStream == null) {
            throw new IllegalArgumentException("File not found!");
        }
        Alien al = om.readValue(inputStream, Alien.class);
        System.out.println(al);


    }
}
