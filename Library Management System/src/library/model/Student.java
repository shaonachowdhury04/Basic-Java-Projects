package library.model;

public class Student extends User {
    private int maxBooksAllowed=3;
    public Student(int userId, String name) {
        super(userId, name);
    }
    public int getMaxBooksAllowed() {
        return maxBooksAllowed;
    }
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}


