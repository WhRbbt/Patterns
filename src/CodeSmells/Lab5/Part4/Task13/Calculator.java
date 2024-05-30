package CodeSmells.Lab5.Part4.Task13;

public class Calculator {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("�� ����� ����� �� ����");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("��������� ������: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("�������: " + e.getMessage());
        }
    }
}