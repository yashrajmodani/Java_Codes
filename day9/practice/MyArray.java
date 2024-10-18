package day9.practice;
public class MyArray {
    public static synchronized
    void display(char[] arr ){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        char [] greeting = {'G','o','o','d',' ','M','o','r','n','i','n','g'};
        Thread t1 = new Thread(() -> {
            MyArray.display(greeting);
            System.out.println();
        });

        Thread t2 = new Thread(() -> {
            MyArray.display(greeting);
            System.out.println();
        });

        t1.start();
        t2.start();

    }
}

