package entity.userSearch;

public class UserData {
    private User user;

    public UserData(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "user=" + user +
                '}';
    }
}

