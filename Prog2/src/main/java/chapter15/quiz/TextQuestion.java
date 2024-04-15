package chapter15.quiz;

public class TextQuestion extends Question {
    public TextQuestion(String question) {
        super(question);
    }
    @Override
    public void printQuestion() {
        System.out.println(question + "\n\n" + "Antwort: " + "\n\n\n");
    }
}
