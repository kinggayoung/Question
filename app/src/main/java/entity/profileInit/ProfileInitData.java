package entity.profileInit;

public class ProfileInitData {
    private ProfileInit profile;

    public ProfileInitData(ProfileInit profile) {
        this.profile = profile;
    }

    public ProfileInit getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return "ProfileInitData{" +
                "profile=" + profile +
                '}';
    }
}
