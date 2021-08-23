package InheritanceStudio;


public class MultipleChoice extends Question {


    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    public boolean checkAnswer(String answer) {
        String correctAnswer = this.getAnswer();
        if(answer.toLowerCase().equals(correctAnswer)) {
            return true;
        } else {
            return false;
        }
    }
}
