package InheritanceStudio;

abstract class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    //getters, no setters because we will build questions later!
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }


    //remember abstract methods do not have bodies!
    public abstract boolean checkAnswer(String answer);
}
