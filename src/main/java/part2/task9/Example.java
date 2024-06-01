package part2.task9;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static final int MAX_ELEMENT_COUNT = 100; // символічна константа

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        // Додавання елементів у список
        for (int i = 0; i < MAX_ELEMENT_COUNT; i++) {
            items.add("Item " + i);
        }
    }
}