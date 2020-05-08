package entity.logout;

public class LogoutResponse {
    private String message;
    private LogoutData data;

    public LogoutResponse(String message, LogoutData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public LogoutData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "LogoutResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
