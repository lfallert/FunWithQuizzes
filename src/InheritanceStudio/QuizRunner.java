package InheritanceStudio;

import java.util.ArrayList;

public class QuizRunner {

    public static void main(String args[]) {

        Quiz officeQuiz = new Quiz();

        TrueFalse q1 = new TrueFalse("True or False: In \"The Office\", Pam begins the series as the receptionist.", "true");

        MultipleChoice q2 = new MultipleChoice("In \"The Office\", who is the boss? A. Michael, B. Jim, C. Dwight", "a");

        Checkbox q3 = new Checkbox ("In \"The Office\", who are the accountants? A. Angela, B. Oscar, C. Toby","ab");


        officeQuiz.addQuestion(q1);
        officeQuiz.addQuestion(q2);
        officeQuiz.addQuestion(q3);

        officeQuiz.runQuiz();

    }
}
