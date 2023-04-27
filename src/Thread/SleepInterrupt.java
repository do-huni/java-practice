import java.util.*;

class SleepInterrupt{
    public static void main(String[] args){
        Thread th1 = new Thread1();
        th1.start();
        Scanner s1 = new Scanner(System.in);
        String input = s1.nextLine();
        System.out.println("입력하신 값은 [" + input + "] 입니다.");
        
    }
}

class Thread1 extends Thread{
    public void run(){
        int i = 10;
        while(i!=0 && !this.isInterrupted()){
            System.out.println(i--);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                this.interrupt();
            }
        }
     System.out.println("카운트가 종료되었습니다.");    
    }
}