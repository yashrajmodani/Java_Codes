package day6;

public class Stat<T extends Number> {
    T [] num;

    public void setValues(T[] num){
        this.num = num;
    }

    public double getAv(){
        double sum = 0.0;
        for(int i = 0; i < num.length; i++){
            sum += num[i].doubleValue();
        }
        return sum/num.length;
    }

    public static void main(String[] args) {
        Integer [] arr = {12, 14, 16, 18, 20};

        Stat<Integer> stat1 = new Stat<>();
        stat1.setValues(arr);
        System.out.println(stat1.getAv());


        Double [] arr1 = {12.56, 14.56, 16.56, 18.56, 20.56};
        Stat<Double> stat2 = new Stat<>();
        stat2.setValues(arr1);
        System.out.println(stat2.getAv());
    }
}
