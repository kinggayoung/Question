package entity.userSearch;

public class Profile {
    private String id;
    private String userId;
    private String prefileImg;
    private String greeting;

    public Profile(String id, String userId, String prefileImg, String greeting) {
        this.id = id;
        this.userId = userId;
        this.prefileImg = prefileImg;
        this.greeting = greeting;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPrefileImg() {
        return prefileImg;
    }

    public String getGreeting() {
        return greeting;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", prefileImg='" + prefileImg + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
