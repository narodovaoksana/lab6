package part4.task8;

public class Processor {
    private Calculator calculator;

    public Processor(Calculator calculator) {
        this.calculator = calculator;
    }

    public int process() {
        int x = getXValue();
        int y = getYValue();
        int result = calculator.add(x, y);
        return result;
    }

    private int getXValue() {
        return 10;
    }

    private int getYValue() {
        return 20;
    }
}

