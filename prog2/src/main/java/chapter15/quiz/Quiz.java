package chapter15.quiz;

public class Quiz {
    public static void main(String[] args) {
        Question q1 = new TextQuestion("Wie ist die Hauptstadt von Deutschland?");
        Question q2 = new MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?", new String[]{"4", "2", "1", "0"});
        Question q3 = new TextQuestion("Wer ist unser aktueller Bundeskanzler?");

        Question[] questions = new Question[]{q1, q2, q3};
        for (Question i : questions) {
            i.printQuestion();
        }
    }
}
