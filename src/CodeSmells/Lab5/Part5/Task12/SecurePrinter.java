package CodeSmells.Lab5.Part5.Task12;

public class SecurePrinter extends Printer {
    public void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        print(document);
    }
}
