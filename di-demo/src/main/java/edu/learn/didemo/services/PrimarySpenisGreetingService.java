package edu.learn.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpenisGreetingService implements  GreetingService{


    @Override
    public String sayGreeting() {
        return "Hola: servicio de saludo principal";
    }
}
