package entity.userSearch;

public class User {
    private String id;
    private String nickname;
    private String password;
    private String createdAt;
    private String updatedAt;
    private Profile profile;

    public User(String id, String nickname, String password, String createdAt, String updatedAt, Profile profile) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profile = profile;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Profile getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", profile=" + profile +
                '}';
    }
}

