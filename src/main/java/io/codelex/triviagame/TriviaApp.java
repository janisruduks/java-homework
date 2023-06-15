package io.codelex.triviagame;

import java.util.Scanner;

public class TriviaApp {

    private static final int QUESTION_AMOUNT = 20;
    private static final boolean cheatMode = true;

    private static int answeredQuestions = 0;
    private static boolean answeredWrong = false;

    // Need to fix duplicate answer numbers...
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        AnswerBucket answerBucket = new AnswerBucket();

        welcomeUser();
        System.out.println("To start type 'start'");
        keyboard.next();

        while (!answeredWrong && answeredQuestions != QUESTION_AMOUNT) {
            answerTheQuestion(keyboard, validate(TriviaApi.getTriviaQuestion()), answerBucket);
        }
        endPhase(answerBucket, keyboard);
    }

    private static void answerTheQuestion(Scanner keyboard, TriviaQuestion question, AnswerBucket bucket) {
        if (cheatMode) {
            System.out.println(question.getNumber());
        }
        System.out.println("Question " + (answeredQuestions + 1) + ". " + question.getTriviaQuestion());

        question.setPossibleAnswers(); // we need to set manually because answer now = 0
        question.displayPossibleAnswers();

        long answer = (keyboard.nextLong());
        question.setUserAnswer(answer);

        if (answer == question.getNumber()) {
            question.setAnsweredCorrectly(true);
            bucket.addAnsweredTrivia(question);
        } else {
            question.setAnsweredCorrectly(false);
            bucket.addAnsweredTrivia(question);
            answeredWrong = true;
        }
        answeredQuestions++;
    }

    private static TriviaQuestion validate(TriviaQuestion question) {
        if (question != null && question.isFound()) {
            return question;
        } else {
            return TriviaApi.getTriviaQuestion();
        }
    }

    private static void endPhase(AnswerBucket bucket, Scanner keyboard) {
        if (answeredWrong) {
            System.out.println("You didn't guess correctly...");
            ASCIIArt.displayCarLostASCII();
            seeQuestionsPrompt(keyboard, bucket);
        } else if (answeredQuestions == QUESTION_AMOUNT) {
            System.out.println("You got your car back!");
            ASCIIArt.displayCarWonASCII();
            seeQuestionsPrompt(keyboard, bucket);
        }
    }

    private static void seeQuestionsPrompt(Scanner keyboard, AnswerBucket bucket) {
        System.out.println("To see questions and answers type 'see'");
        keyboard.next();
        bucket.displayBucket();
    }

    private static void welcomeUser() {
        System.out.println("Welcome to TRIVIA-TOW-MAN!");
        System.out.println("We are towing your car away, but you can get it back!");
        System.out.println("I will ask you " + QUESTION_AMOUNT + " questions, and you need to answer them!");
        System.out.println("If you do, you get back your car!");
    }
}
