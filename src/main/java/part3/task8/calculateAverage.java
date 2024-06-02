package part3.task8;

public class calculateAverage {
    public double calculateAverage(int[] numbers) {
        assert numbers!= null : "The numbers array cannot be null";
        assert numbers.length > 0 : "The numbers array cannot be empty";

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
