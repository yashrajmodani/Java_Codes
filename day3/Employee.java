package day3;

import day44.Printable;

public abstract class Employee implements Printable{
    protected static int empid = 1000;
    protected String name;

    public Employee(String name){
        this.empid += 1;
        this.name = name;
    }

    public abstract double calculateGross();

    @Override
    public void print() {
        System.out.println("Employee id: " + this.empid + " name: "+this.name);
    }

    public String toString(){
        return "Employee id: " + this.empid + " name: "+this.name;
    }
}
