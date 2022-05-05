package com.clairdess.math;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MathService {

    private Random random = new Random();
    private int max = 10;

    public Exercise getRandom() {
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        return Exercise.builder().text(a + " + " + b + " = ?").answer(String.valueOf(a + b)).build();
    }
}
