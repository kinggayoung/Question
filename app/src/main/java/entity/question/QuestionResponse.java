package entity.question;

public class QuestionResponse {
    private String message;
    private QuestionData data;

    public QuestionResponse(String message, QuestionData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public QuestionData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "QuestionResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
