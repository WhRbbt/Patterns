package CodeSmells.Lab5.Part1.Task6;

public class Department {
    private String name;
    private Employee manager;

    public String getManagerName() {
        return manager.getName();
    }
}