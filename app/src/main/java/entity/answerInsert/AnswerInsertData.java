package entity.answerInsert;

public class AnswerInsertData {
    private AnswerInsert answer;

    public AnswerInsertData(AnswerInsert answer) {
        this.answer = answer;
    }

    public AnswerInsert getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "AnswerInsertData{" +
                "answer=" + answer +
                '}';
    }
}
