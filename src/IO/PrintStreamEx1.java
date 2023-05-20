import java.io.*;
import java.util.*;

class PrintStreamEx1{
    public static void main(String[] args){
        //printf
        int i = 65;
        float f = 1234.56789f;
        
        Date d = new Date();
        
        System.out.printf("문자 %c의 코드는 %d\n", i, i);
        System.out.printf("%d는 8진수로 %o, 16진수로 %x\n", i, i, i);
        System.out.printf("%f를 소수점 첫째짜리까지만 쓰면 %.1f\n", f, f);
        System.out.printf("오늘은 %tY년 %tm월 %td일\n", d,d,d);      
        System.out.printf("지금은 %tH시 %tM분 %tS초", d,d,d);
    }
}