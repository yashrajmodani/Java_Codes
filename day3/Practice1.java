package day3;

public class Practice1 {

    public static String countChar(String str){
        int lower = 0, upper = 0, num = 0, special = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper += 1;
            }
            else if(ch >= 'a' && ch <= 'z') {
                lower += 1;
            }
            else if(ch >= '0' && ch <= '9'){
                num += 1;
            }
            else{
                special += 1;
            }
        }
        return "Lower: " + lower + " Upper: " + upper + " Special: " + special + " Numbers: " + num;
    }





    public static void main(String[] args) {
        String str = "#JavavavJAJAs01lavaOr@LEEks07Cheeks";
        System.out.println(countChar(str));
    }

}
