package CodeSmells.Lab5.Part2.Task8;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
}