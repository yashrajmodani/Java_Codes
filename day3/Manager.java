package day3;

public class Manager extends SalariedEmployee{
    protected float allowance;
    public Manager( String name, double basic, int allowance){
        super( name, basic);
        this.allowance = allowance;
    }

    @Override
    public double calculateGross() {
        double gross =  super.calculateGross();
        return gross + gross * (this.allowance/ 100);
    }
}
