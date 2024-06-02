package part4.task14;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            return Double.NaN;
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double fahrenheit = -500;
        if (fahrenheit < -459.67) {
            System.out.println("Помилка: Неприпустима температура: менше абсолютного нуля");
        } else {
            double celsius = convertToCelsius(fahrenheit);
            System.out.println("Температура в градусах Цельсія: " + celsius);
        }
    }
}

