package com.example.quiz_example;

import java.util.ArrayList;

public class Question {

    private String question;
    private String answer_a;
    private String answer_b;
    private String answer_c;
    private String answer_d;
    private String correct;

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer_a() {
        return answer_a;
    }

    public void setAnswer_a(String answer_a) {
        this.answer_a = answer_a;
    }

    public String getAnswer_b() {
        return answer_b;
    }

    public void setAnswer_b(String answer_b) {
        this.answer_b = answer_b;
    }

    public String getAnswer_c() {
        return answer_c;
    }

    public void setAnswer_c(String answer_c) {
        this.answer_c = answer_c;
    }

    public String getAnswer_d() {
        return answer_d;
    }

    public void setAnswer_d(String answer_d) {
        this.answer_d = answer_d;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public static ArrayList<Question> startGame(){
        ArrayList<Question> questions = new ArrayList<>();

        Question question = new Question();
        question.question = "Πότε ξεκίνησε ο Ο Α΄ Παγκόσμιος Πόλεμος";
        question.answer_a = "28 Ιουλίου 1914";
        question.answer_b = "15 Απριλίου 1915";
        question.answer_c = "28 Μαίου 1914";
        question.answer_d = "11 Νοεμβρίου 1918";
        question.correct = "28 Ιουλίου 1914";
        questions.add(question);

        question = new Question();
        question.question = "Πότε τελείωσε ο Ο Α΄ Παγκόσμιος Πόλεμος";
        question.answer_a = "28 Ιουλίου 1914";
        question.answer_b = "15 Απριλίου 1915";
        question.answer_c = "28 Μαίου 1914";
        question.answer_d = "11 Νοεμβρίου 1918";
        question.correct = "11 Νοεμβρίου 1918";

        questions.add(question);

        return questions;
    }
}
