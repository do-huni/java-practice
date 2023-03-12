import java.util.*;

class StringArray{
    public static void main(String[] args){
        String[] name = {"Kim", "Seok", "Do", "Han", "Hun", "Byeol"};
        for(String i : name){
            System.out.println(i);
        }
        
        //String 클래스의 정의: char배열에 기능(메서드)를 추가한 것
        
        String myStr = "WelcomeToTheBlackParade";
        
        System.out.println(myStr.charAt(10));
        System.out.println(myStr.length());
        System.out.println(myStr.substring(7,myStr.length()));
        System.out.println(myStr.equals("WelcomeToTheBlackParade"));
        System.out.println(Arrays.toString(myStr.toCharArray()));
        
        char[] charArray = {'A','B','C'};
        String arrToString = new String(charArray);
        System.out.println(arrToString);
        
        //커맨드 라인으로 입력 받기
        System.out.println("매개변수의 개수: " + args.length);
        
    }
}