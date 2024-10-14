package day5;

public class StringMethods {
    public static String convertToLower(String s) throws EmptyStringException{
        if(s==""){
            throw new EmptyStringException("String is empty.");
        }else{
            return s.toLowerCase();
        }
    }

    public static void main(String[] args) {
        String s = "Java is an Object Oriented Language";
        String l = "";
        try{
            String lower = convertToLower(l);
            System.out.println(lower);
        }catch(EmptyStringException e){
            System.out.println(e.getMessage());
        }

    }
}
