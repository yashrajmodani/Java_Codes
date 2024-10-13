package day44;

public interface Writable {
    void write();
    default void foo(){
        System.out.println("This is a default Function");
    }
}