package part4.task6;

public class Printer {
    public void printTextDocument(String content) {
        System.out.println("Printing text document: " + content);
    }

    public void printImageDocument(String content) {
        System.out.println("Printing image document: " + content);
    }

    public void printDocument(String type, String content) {
        if ("text".equals(type)) {
            printTextDocument(content);
        } else if ("image".equals(type)) {
            printImageDocument(content);
        } else {
            System.out.println("Unknown document type: " + type);
        }
    }
}

