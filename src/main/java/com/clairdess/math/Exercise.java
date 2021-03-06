package com.clairdess.math;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Exercise {

    private String text;
    private String answer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return text.equals(exercise.text) && answer.equals(exercise.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, answer);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                ", text='" + text + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}