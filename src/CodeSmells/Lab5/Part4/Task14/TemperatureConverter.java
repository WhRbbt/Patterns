package CodeSmells.Lab5.Part4.Task14;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            System.out.println("Неприпустима температура: менше абсолютного нуля");
            return -1;
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double celsius = convertToCelsius(-500);
        if (celsius == -1) {
            System.out.println("Помилка: Неприпустима температура");
        } else {
            System.out.println("Температура в градусах Цельсія: " + celsius);
        }
    }
}