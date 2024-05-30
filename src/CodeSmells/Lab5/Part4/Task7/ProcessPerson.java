package CodeSmells.Lab5.Part4.Task7;

public class ProcessPerson {
    public void process(Person person) {
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();
    }
}