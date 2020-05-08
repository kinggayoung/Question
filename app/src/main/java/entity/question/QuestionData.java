package entity.question;

import java.util.Arrays;
import java.util.List;

public class QuestionData {
    private List<Question> questions;

    public QuestionData(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestion() {
        return questions;
    }

    @Override
    public String toString() {
        return "QuestionData{" +
                "question=" + questions +
                '}';
    }
}
