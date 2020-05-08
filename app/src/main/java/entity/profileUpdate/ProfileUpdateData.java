package entity.profileUpdate;

public class ProfileUpdateData {
    private ProfileUpdate profile;

    public ProfileUpdateData(ProfileUpdate profile) {
        this.profile = profile;
    }

    public ProfileUpdate getProfile() {
        return profile;
    }

    @Override
    public String toString() {
        return "ProfileUpdateData{" +
                "profile=" + profile +
                '}';
    }
}
