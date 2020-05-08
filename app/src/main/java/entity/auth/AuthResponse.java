package entity.auth;


public class AuthResponse {
    private String message;
    private AuthData data;

    public AuthResponse(String message, AuthData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public AuthData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AuthResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
