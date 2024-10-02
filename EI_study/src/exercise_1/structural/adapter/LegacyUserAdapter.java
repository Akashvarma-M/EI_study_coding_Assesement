package exercise_1.structural.adapter;

public class LegacyUserAdapter implements User {
    private LegacyUser legacyUser;

    public LegacyUserAdapter(LegacyUser legacyUser) {
        this.legacyUser = legacyUser;
    }

    public String getName() {
        return legacyUser.getFullName();
    }

    public String getEmail() {
        return legacyUser.getEmailAddress();
    }
}