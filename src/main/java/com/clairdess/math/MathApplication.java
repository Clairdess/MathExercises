package com.clairdess.math;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

public class MathApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MathApplication.class, args);
    }

}
