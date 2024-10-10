package day1;

public class Account {
    private int accid;
    private String name ;
    private static float intrate;

    static{
        System.out.println("Static block 1");
        intrate = 6.5f;
    }

    static{
        System.out.println("Static block 2");
    }

    public Account()
    {
        this(10000, "aaaa");
    }
    public Account(int accid, String name){
        this.accid = accid;
        this.name = name;


    }
    public static void displayIntrestRate()
    {
        System.out.println("Current intrest rate for a account : " + intrate );

    }

}
