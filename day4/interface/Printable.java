package day44;


public interface Printable {
    void print();
    default void foo(){
        System.out.println("This is a default Function");
    }
}
