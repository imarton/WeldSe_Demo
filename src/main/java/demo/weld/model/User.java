package demo.weld.model;

public class User {

    public User() {
    }

    public User(String fullName) {
        this.fullName = fullName;
    }

    String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
