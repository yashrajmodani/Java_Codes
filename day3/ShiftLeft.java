package day3;

import java.sql.SQLOutput;

public class ShiftLeft {

    public static String leftShift(String str){
        str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(leftShift("Over flow"));
        System.out.println(leftShift("wOver flo"));
    }
}

/*char[] oldChar = newStr.toCharArray();
    char[] newChar = new char[oldChar.length];
    newChar[0] = oldChar[oldChar.length-1];
    for(int i = 1; i < oldChar.length; i++){
        newChar[i] = oldChar[i-1];
    }
    newStr = String.valueOf(newChar);*/