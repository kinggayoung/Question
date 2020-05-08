package entity.questionInsert;

public class QuestionInsertData {
    private QuestionInsert question;

    public QuestionInsertData(QuestionInsert question) {
        this.question = question;
    }

    public QuestionInsert getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "QuestionInsertData{" +
                "question=" + question +
                '}';
    }
}
