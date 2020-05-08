package entity.profileUpdate;

public class ProfileUpdateResponse {
    private String message;
    private ProfileUpdateData data;

    public ProfileUpdateResponse(String message, ProfileUpdateData data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public ProfileUpdateData getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ProfileUpdateResponse{" +
                "message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
