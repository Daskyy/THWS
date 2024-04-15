package chapter15.quiz;

public class Quiz {
    static Question q1 = new TextQuestion("Wie ist die Hauptstadt von Deutschland?");
    static Question q2 = new MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?", new String[]{"4", "2", "1", "0"});
    static Question q3 = new TextQuestion("Wer ist unser aktueller Bundeskanzler?");

    static Question[] questions = new Question[]{q1, q2, q3};

    public static void main(String[] args) {
        for (Question i : questions) {
            i.printQuestion();
        }
    }
}
