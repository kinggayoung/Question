package entity.profileInit;

public class ProfileInitResponse {
    private String message;
    private ProfileInitData data;

    public ProfileInitResponse(String message, ProfileInitData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public ProfileInitData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ProfileInitResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
