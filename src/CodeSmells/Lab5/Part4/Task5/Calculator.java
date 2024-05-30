package CodeSmells.Lab5.Part4.Task5;

public class Calculator {
    public int calculatePower(int num, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
}
