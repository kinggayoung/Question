package entity.profileUpdate;

public class ProfileUpdate {
    private int id;
    private int userId;
    private String profileImg;
    private String greeting;

    public ProfileUpdate(int id, int userId, String profileImg, String greeting) {
        this.id = id;
        this.userId = userId;
        this.profileImg = profileImg;
        this.greeting = greeting;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public String getGreeting() {
        return greeting;
    }

    @Override
    public String toString() {
        return "ProfileUpdate{" +
                "id=" + id +
                ", userId=" + userId +
                ", profileImg='" + profileImg + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
