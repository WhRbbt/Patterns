package CodeSmells.Lab4.RefactoredCode.Task2;

public class LargeClass {
    private String name;
    private int age;
    private String gender;
    private FriendManager friendManager;
    private EnemyManager enemyManager;
    private TaskManager taskManager;

    public LargeClass(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friendManager = new FriendManager();
        this.enemyManager = new EnemyManager();
        this.taskManager = new TaskManager();
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Friends: " + this.friendManager.getFriends());
        System.out.println("Enemies: " + this.enemyManager.getEnemies());
        System.out.println("Tasks: " + this.taskManager.getTasks());
    }
}