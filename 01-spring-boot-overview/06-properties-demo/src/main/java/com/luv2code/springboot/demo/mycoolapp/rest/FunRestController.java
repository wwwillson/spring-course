package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String temName;

    @GetMapping("/teaminfo")
    public String getTeaminfo(){
        return "Coach: " + coachName + ", Team name: " + temName;
    }
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a 5k";
    }
}
