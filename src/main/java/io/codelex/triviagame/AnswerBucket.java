package io.codelex.triviagame;

import java.util.*;

// This will have to go to the dumpster I guess, as it's just an simple List.
public class AnswerBucket {

    private final List<TriviaQuestion> answerBucket = new ArrayList<>();

    public void addAnsweredTrivia(TriviaQuestion question) {
        answerBucket.add(question);
    }

    public void displayBucket() {
        int index = 1;
        for (TriviaQuestion answer : answerBucket) {
            System.out.println("---".repeat(20));
            System.out.println(index + ". Question: " + answer.getTriviaQuestion());
            System.out.println("Correct answer: " + answer.getNumber());
            System.out.println("Answered correctly: " + answer.isAnsweredCorrectly());
            System.out.println("Your answer: " + answer.getUserAnswer());
            System.out.println("---".repeat(20));
            index++;
        }
    }
}
