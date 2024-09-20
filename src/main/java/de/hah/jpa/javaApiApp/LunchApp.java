package de.hah.jpa.javaApiApp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LunchApp {


    public static void main(String[] args) throws JsonProcessingException {
        Alien a = new Alien(1, "Hesham", "Ahrabi");

        ObjectMapper om = new ObjectMapper();

        String jason = om.writeValueAsString(a);
        System.out.println(jason);
    }
}
