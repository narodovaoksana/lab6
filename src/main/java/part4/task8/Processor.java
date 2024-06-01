package part4.task8;

public class Processor {
    private Calculator calculator;
    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }
    public int process(int x, int y) {
        int result = calculator.add(x, y);
        // використання результату
        return result;
    }
}

