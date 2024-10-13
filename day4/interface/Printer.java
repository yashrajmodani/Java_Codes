package day44;

import day3.SalariedEmployee;

public class Printer {
    public void printData(Printable p)
    {
        p.print();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Book b = new Book("Head of Java", 1000);
        printer.printData(b);

        SalariedEmployee se = new SalariedEmployee("Abhishek", 50000);
        printer.printData(se);
    }
}