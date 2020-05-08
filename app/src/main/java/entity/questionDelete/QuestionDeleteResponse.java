package entity.questionDelete;

public class QuestionDeleteResponse {
    private String message;
    private QuestionDeleteData data;

    public QuestionDeleteResponse(String message, QuestionDeleteData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public QuestionDeleteData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "QuestionDeleteResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
