package entity.answerInsert;

public class AnswerInsert {
    private int id;
    private int questionId;
    private int userID;
    private String content;
    private String updatedAt;
    private String createdAt;

    public AnswerInsert(int id, int questionId, int userID, String content, String updatedAt, String createdAt) {
        this.id = id;
        this.questionId = questionId;
        this.userID = userID;
        this.content = content;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getUserID() {
        return userID;
    }

    public String getContent() {
        return content;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "AnswerInsert{" +
                "id=" + id +
                ", questionId=" + questionId +
                ", userID=" + userID +
                ", content='" + content + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}

