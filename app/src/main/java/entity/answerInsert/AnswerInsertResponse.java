package entity.answerInsert;

public class AnswerInsertResponse {
    private String message;
    private AnswerInsertData data;

    public AnswerInsertResponse(String message, AnswerInsertData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public AnswerInsertData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AnswerInsertResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
