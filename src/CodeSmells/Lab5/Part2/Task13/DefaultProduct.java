package CodeSmells.Lab5.Part2.Task13;

public class DefaultProduct extends Product {
    public DefaultProduct(String name) {
        super(name);
    }

    @Override
    public void process() {
        // Поведінка за замовчуванням
    }
}