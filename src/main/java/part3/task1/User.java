package part3.task1;

public class User {
    private boolean isLoggedIn;
    private boolean isActive;

    public User(boolean isLoggedIn, boolean isActive) {
        this.isLoggedIn = isLoggedIn;
        this.isActive = isActive;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean hasPermission(Resource resource) {

        return true;
    }
}



