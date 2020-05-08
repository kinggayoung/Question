package entity.userCreate;

public class UserCreateResponse {
    private String message;
    private UserCreateData data;

    public UserCreateResponse(String message, UserCreateData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }


    public UserCreateData getData() {
        return data;
    }



    @Override
    public String toString() {
        return "UserCreateResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
