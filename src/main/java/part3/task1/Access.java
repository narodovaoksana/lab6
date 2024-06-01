package part3.task1;

public class Access {
    public void checkAccess(part3.task1.User user, Resource resource) {
        if (checkAccessCondition(user, resource)) {
            if (isAccessAllowed(user, resource)) {
                grantAccess();
            } else {
                denyAccess();
            }
        } else {
            denyAccess();
        }
    }

    private boolean checkAccessCondition(part3.task1.User user, Resource resource) {
        return user != null && user.isLoggedIn() && resource != null;
    }

    private boolean isAccessAllowed(User user, Resource resource) {
        return user.hasPermission(resource) && user.isActive();
    }

    private void grantAccess() {
        System.out.println("Access granted");
    }

    private void denyAccess() {
        System.out.println("Access denied");
    }
}