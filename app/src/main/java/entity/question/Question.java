package entity.question;

import java.util.Arrays;
import java.util.List;

public class Question {
    private int id;
    private int userId;
    private String title;
    private String content;
    private String createdAt;
    private String updateAt;
    //    private Answer[] answers;
    private List<Answer> answers;

    public Question(int id, int userId, String title, String content, String createdAt, String updateAt, List<Answer> answers) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", answers=" + answers +
                '}';
    }
}