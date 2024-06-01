package part2.task9;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        // Додавання елементів у список
        for (int i = 0; i < 100; i++) {
            items.add("Item " + i);
        }
    }
}

