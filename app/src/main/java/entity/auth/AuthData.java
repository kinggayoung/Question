package entity.auth;

public class AuthData {
    private String token;

    public AuthData(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "AuthData{" +
                "token='" + token + '\'' +
                '}';
    }
}
