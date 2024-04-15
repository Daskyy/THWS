package chapter15.quiz;

public abstract class Question {
    String question;

    public Question(String question) {
        this.question = question;
    }

    public abstract void printQuestion();
}
