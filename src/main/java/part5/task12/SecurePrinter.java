package part5.task12;

public class SecurePrinter extends Printer {
    void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        print(document);
    }
}