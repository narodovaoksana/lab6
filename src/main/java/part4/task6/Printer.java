package part4.task6;

public class Printer {
    public void printDocument(String type, String content) {
        if ("text".equals(type)) {
            System.out.println("Printing text document: " + content);
        } else if ("image".equals(type)) {
            System.out.println("Printing image document: " + content);
        } else {
            System.out.println("Unknown document type: " + type);
        }
    }
}

