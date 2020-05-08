package entity.answerDelete;

public class AnswerDeleteResponse {
    private String message;
    private AnswerDeleteData data;



    public AnswerDeleteResponse(String message, AnswerDeleteData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public AnswerDeleteData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AnswerDeleteResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
