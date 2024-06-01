package part4.task13;

public class Calculator {
    public static int divide(int dividend, int divisor) {

        if (divisor == 0) {
            return -1; // Повертаємо -1 у випадку ділення на нуль
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int result = divide(10, 0);
        if (result == -1) {
            System.out.println("Помилка: Ділення на нуль");
        } else {
            System.out.println("Результат ділення: " + result);
        }
    }
}
