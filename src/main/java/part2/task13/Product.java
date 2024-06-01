package part2.task13;

public class Product {
    private int typeCode;
    private String name;
    public Product(int typeCode, String name) {
        this.typeCode = typeCode;
        this.name = name;
    }
    public void process() {
        if (typeCode == 1) {
            // Поведінка для типу 1
        } else if (typeCode == 2) {
            // Поведінка для типу 2
        } else {
            // Поведінка за замовчуванням
        }
    }
    // Додаткові методи...
}