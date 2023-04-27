import java.util.*;
import java.io.*;

class ThreadEx2{
    public static void main(String[] args) throws Exception{
        Thread t2 = new Thread(new Thread2());
        t2.start();
        Scanner s1 = new Scanner(System.in);
        String input;
        do{
            System.out.println("아무값이나 입력하세요.");    
            input = (String)s1.nextLine().trim();
            System.out.println("입력값은 " + input + "입니다.");
        } while(false);
        
        
    }
}

class Thread2 implements Runnable{
    
    public void run(){
        
        for (int i = 0; i < 1000; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}