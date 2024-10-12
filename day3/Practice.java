package day3;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String str1 = "Earth";
        String str2 = "heart";

         if(str1.length() != str2.length()){
             System.out.println("Not Anagram");
        }else {
             char[] charArray1 = str1.toLowerCase().toCharArray();
             char[] charArray2 = str2.toLowerCase().toCharArray();

             Arrays.sort(charArray1);
             Arrays.sort(charArray2);

             if(Arrays.equals(charArray1, charArray2))
                 System.out.println("Anagram!!!!!!");
             else
                 System.out.println("Not Anagram pooooo!!!");
         }
    }
}
