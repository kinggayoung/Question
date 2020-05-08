package entity.answerUpdate;

public class AnswerUpdateResponse {
    private String message;
    private AnswerUpdateData data;

    public AnswerUpdateResponse(String message, AnswerUpdateData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public AnswerUpdateData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AnswerUpdateResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
