package com.bridgelabz.service;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    private long id = 1;

    public Greeting saveGreeting(String message) {

        Greeting greeting = new Greeting(id++, message);

        return greetingRepository.save(greeting);
    }

    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    public Greeting editGreeting(Long id,String message) {

        Greeting greeting = greetingRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Greeting Not Found"));

        greeting.setMessage(message);

        return greeting;
    }

    public String getGreetingMessage(String firstName, String lastName) {

        if(firstName != null && lastName != null)
            return "Hello " + firstName + " " + lastName;

        if(firstName != null)
            return "Hello " + firstName;

        if(lastName != null)
            return "Hello " + lastName;

        return "Hello World";
    }
}
