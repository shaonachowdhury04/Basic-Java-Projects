package library.model;

public class Admin extends User {
    private boolean canManageBooks = true;
    public Admin(int userId, String name) {
        super(userId, name);
    }
    public boolean canManageBooks() {
        return canManageBooks;
    }
    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }
}
