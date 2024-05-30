package CodeSmells.Lab5.Part4.Task8;

public class Processor {
    private Calculator calculator;

    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }

    public int process(int x, int y) {
        return calculator.add(x, y);
    }
}