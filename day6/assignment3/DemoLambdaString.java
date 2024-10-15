package day6.assignment3;

public class DemoLambdaString {
    public String operateOnString(StringFunction f, String s){
        return f.apply(s);
    }

    public String reverseString(StringFunction f, String s){
        return f.apply(s);
    }

    public static void main(String[] args) {
        DemoLambdaString s = new DemoLambdaString();
        String st = "My name is mayuresh";

        String result = s.operateOnString((n) -> n.toUpperCase(), st);
        System.out.println(result);

        String res1 = s.reverseString((n) -> {
            String rev = "";
            for (int i = n.length() - 1; i >= 0; i--) {
                rev += n.charAt(i);
            }
            return rev;
        }, st);
        System.out.println(res1);


    }
}
