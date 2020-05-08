package entity.questionUpate;

public class QuestionUpdateResponse {
    private String message;
    private QuestionUpdateData data;

    public QuestionUpdateResponse(String message, QuestionUpdateData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public QuestionUpdateData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "QuestionUpdateResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
