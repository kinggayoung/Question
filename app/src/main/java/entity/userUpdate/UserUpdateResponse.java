package entity.userUpdate;

public class UserUpdateResponse {
    private String message;
    private UserUpdateData data;

    public UserUpdateResponse(String message, UserUpdateData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public UserUpdateData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "UserUpdateResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
