package entity.userDelete;

public class UserDeleteResponse {
    private String message;

    public UserDeleteResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "UserDeleteResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
