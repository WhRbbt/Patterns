package CodeSmells.Lab4.RefactoredCode.Task2;

import java.util.ArrayList;
import java.util.List;

class EnemyManager {
    private List<String> enemies = new ArrayList<>();

    public void addEnemy(String enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        enemies.remove(enemy);
    }

    public List<String> getEnemies() {
        return enemies;
    }
}
