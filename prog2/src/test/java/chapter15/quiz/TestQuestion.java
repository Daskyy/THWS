package chapter15.quiz;

import org.junit.jupiter.api.Test;
public class TestQuestion {
    @Test
    public void testTextfrage() {
        Question question = new TextQuestion("Was ist die Hauptstadt von Deutschland?");

        question.printQuestion();
    }

    @Test
    public void testMultipleChoice() {
        Question question = new MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?", new String[]{"0", "1", "2", "3"});

        question.printQuestion();
    }
    @Test
    public void testMultiple() {
        Question q1 = new TextQuestion("Wie ist die Hauptstadt von Deutschland?");
        Question q2 = new MultipleChoice("Wie viele Protonen hat ein Wasserstoff-Atom?", new String[]{"4", "2", "1", "0"});
        Question[] questions = new Question[]{q1, q2};

        for (Question i : questions) {
            i.printQuestion();
        }
    }
}
