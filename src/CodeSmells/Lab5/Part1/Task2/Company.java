package CodeSmells.Lab5.Part1.Task2;

import java.util.List;
import java.util.Map;

public class Company {
    private List<Employee> employees;
    private Map<Employee, Double> employeeSalaries;

    public void printEmployeeSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employeeSalaries.get(employee));
        }
    }
}