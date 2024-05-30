package CodeSmells.Lab5.Part4.Task9;

public class UserDetails {
    private String name;
    private int age;
    private String email;

    public UserDetails(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}