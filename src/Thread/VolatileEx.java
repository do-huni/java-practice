class VolatileEx{
    public static void main(String[] hehe){
        //volatile: 코어가 변수 값을 읽어올 때 캐시가 아닌 메모리에서 참조함.        
        
        //용도 1: 멀티코어 환경에서 여러 쓰레드가 동시에 참조하는 변수 값을 volatile로 선언.
        CustomThread th2 = new CustomThread("th2");
        
        th2.start();
        th2.jjeggak();
        
        
    }    
}

class CustomThread implements Runnable{
    Thread th = new Thread();
    int num = 10;
    //boolean stop = false; volatile 선언안하면 끝이 났는데 연산 한번 더 되는 경우가 발생
    volatile boolean stopfixed = false;
    
    CustomThread(String name){        
        th = new Thread(this, name);
    }
    public void start()   { th.start(); }
    
    public void run(){
        while(true){
        while(!stopfixed){
            num +=1;
            System.out.println(th.getName() + ": " + num);            
            
        }
            try{Thread.sleep(10);} catch(InterruptedException e){};
            
    }}
    public void jjeggak(){
        for(int i = 0; i < 10; i++){
            this.stopfixed = !stopfixed;
            System.out.println("jjegak");
            th.interrupt();
            try{Thread.sleep(100);} catch(InterruptedException e){};
        }
        System.out.println("끝!");
        th.interrupt();        
        this.stopfixed = true;
    }
}

