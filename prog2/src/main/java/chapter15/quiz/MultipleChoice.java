package chapter15.quiz;

public class MultipleChoice extends Question {
    String[] answers;

    public MultipleChoice(String question, String[] answers) {
        super(question);
        this.answers = answers;
    }

    @Override
    public void printQuestion() {
        String toPrint = "Fragentext:\n" + question + "\n\nAntwortmöglichkeiten:\n";

        for (int i = 0; i < answers.length; i++) {
            toPrint += Character.toString('A' + i) + ": " + answers[i] + "\n";
        }

        System.out.println(toPrint);
    }
}
