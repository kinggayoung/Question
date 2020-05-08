package entity.userCreate;

public class UserCreateData {
    private String id;
    private String nickname;
    private String password;
    private String updatedAt;
    private String createdAt;

    public UserCreateData(String id, String nickname, String password, String updatedAt, String createdAt) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "UserCreateData{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}


