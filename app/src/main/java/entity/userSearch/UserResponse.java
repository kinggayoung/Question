package entity.userSearch;


public class UserResponse {
    private String message;
    private UserData data;

    public UserResponse(String message, UserData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public UserData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "UserResponce{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
