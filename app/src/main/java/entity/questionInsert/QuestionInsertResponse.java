package entity.questionInsert;

public class QuestionInsertResponse {
    private String message;
    private QuestionInsertData data;

    public QuestionInsertResponse(String message, QuestionInsertData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public QuestionInsertData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "QuestionInsertResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
