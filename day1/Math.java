package day1;

public class Math {
    public int factorial (int n){
        int result = 1;
        for(int i=2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public boolean isPrime(int n){
        for(int i = 2; i< n; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public float add(int a, float b ){
        return a+b;

    }
    public int add(int a, int b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }

    public static void additon(int...num)
    {
        int res=0;
        for(int i : num){
            res+=i;

        }
    }


    public static void main (String[] args) {
        Math m = new Math();
        int result = m.factorial(5);
        System.out.println(result);

        boolean prime = m.isPrime(69);
        System.out.println(prime);

        result = m.add(1, 2);
        System.out.println(result);

        result = m.add(1, 2);
        System.out.println(result);

        result = m.add(105, 2);
        System.out.println(result);


    }
}