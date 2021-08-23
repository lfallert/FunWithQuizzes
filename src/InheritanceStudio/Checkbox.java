package InheritanceStudio;


public class Checkbox extends Question {

    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getAnswer();
        if (answer.toLowerCase().equals(actualAnswer)) {
            return true;
        } else {
            return false;
        }
    }
}
