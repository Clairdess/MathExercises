package com.clairdess.math.controllers;

import com.clairdess.math.Exercise;
import com.clairdess.math.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    MathService mathService;
    //ExerciseRepo exerciseRepo;

    @GetMapping("/questions")
    public List<Exercise> getExercisesAPI(@RequestParam int amount) {
        List<Exercise> exerciseList = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            exerciseList.add(mathService.getRandom());
        }
        return exerciseList;
    }

    //@Autowired
    //public void setExerciseRepo(ExerciseRepo exerciseRepo) {
    //    this.exerciseRepo = exerciseRepo;
    //}

    @Autowired
    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

}
