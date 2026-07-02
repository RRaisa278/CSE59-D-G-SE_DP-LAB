
interface Printer {
    void printDocument();
}


interface Scanner {
    void scanDocument();
}

interface FaxMachine {
    void faxDocument();
}


class BasicPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }
}


class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document...");
    }

    @Override
    public void faxDocument() {
        System.out.println("Faxing document...");
    }
}


public class Main2 {
    public static void main(String[] args) {

        BasicPrinter printer = new BasicPrinter();
        printer.printDocument();

        MultiFunctionCopier copier = new MultiFunctionCopier();
        copier.printDocument();
        copier.scanDocument();
        copier.faxDocument();
    }
}
