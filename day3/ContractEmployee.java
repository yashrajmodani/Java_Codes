package day3;

public class ContractEmployee extends Employee{
    protected double remuneration;
    protected int hrs;
    public ContractEmployee(String name, double remuneration, int hrs){
        super( name);
        this.remuneration = remuneration;
        this.hrs = hrs;
    }
    @Override
    public double calculateGross(){
        return remuneration * hrs;
    }


}
