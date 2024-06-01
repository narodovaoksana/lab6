package part4.task14;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) throws Exception {
        if (fahrenheit < -459.67) {
            throw new Exception("Неприпустима температура: менше абсолютного нуля");
        }
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        try {
            double celsius = convertToCelsius(-500); // Викидає виключення через недійсну температуру
            System.out.println("Температура в градусах Цельсія: " + celsius);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}

