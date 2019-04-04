package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.String;
import java.lang.System;
import java.io. *;
@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);
    }
    Calculator myCalculator = new Calculator();
    double resultAdd = myCalculator.addingAToB(10.5,15.25);
    double resultSubstract = myCalculator.substractAFromB(25.40,12.15);
}
