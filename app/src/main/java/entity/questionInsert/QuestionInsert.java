package entity.questionInsert;

public class QuestionInsert {
    private int id;
    private int userId;
    private String title;
    private String content;
    private String updateAt;
    private String createAt;

    public QuestionInsert(int id, int userId, String title, String content, String updateAt, String createAt) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.updateAt = updateAt;
        this.createAt = createAt;
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

    public String getUpdateAt() {
        return updateAt;
    }

    public String getCreateAt() {
        return createAt;
    }

    @Override
    public String toString() {
        return "QustionInsert{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", updateAt='" + updateAt + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }
}
