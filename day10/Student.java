package day10;

public class Student {

    private int rollno;
    private String name;

    public Student(){
        rollno= 100;
        name = "pppp";
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }


    private void privateMethod(){
        System.out.println("This is private method");
    }


    public static void staticMethod(){
        System.out.println("This is a static method");
    }


    @CreatedBy(priority = 1,createdBy = "aaaaaaaa")
    public void displayData(){
        System.out.println("roll no "+ rollno+ "Name "+ name);
    }

    public void methodWithParam(int rollno){
        this.rollno = rollno;
        System.out.println("Rollno set to: " + rollno);
    }
}
