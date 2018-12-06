package com.prac.services;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Perspective on 12/5/2018.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @PostConstruct
    public String postConstruct(){
        System.out.println("Calling Post Construct");
        return "foo";
    }


    @Override
    public String sayGreeting() {
        return null;
    }

    @PreDestroy
    public String preDestroy(){
        System.out.println("Calling Pre destroy..........");
        return "foo";
    }

}
