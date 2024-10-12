package day3;

public class EmployeePortal {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        SalariedEmployee e1 = new SalariedEmployee("Gagan", 100000);
        System.out.println(e1);
        payroll.displayGross(e1);
        payroll.displayNet(e1);

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("Yash", 50000);     //UPCASTING
        emps[1] = new Manager("sss", 90000, 20);

        /*
        calculateGross is defined in Employee and overriden in Salaried Employee hence
        can be invoked using employee reference emps[0]
        */
        System.out.println(emps[0]);
        payroll.displayGross(emps[0]);
//        payroll.displayNet(emps[0]);

        /*
        TO invoke CalculateNet() which is defined in SalariedEmployee the Employee reference
         must be down casted to SalariedEmployee
        */

        SalariedEmployee s = (SalariedEmployee) emps[1]; //DOWN CASTING
        System.out.println(s);
        payroll.displayNet(s);

    }
}
