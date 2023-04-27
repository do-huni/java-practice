class ThreadEx1{
    public static void main(String[] args) throws Exception{
        System.out.println("메인 쓰레드 작업 시작");
        ThreadExtend th1 = new ThreadExtend();
        th1.setName("쓰레드1");
        
        
        Thread th2 = new Thread(new ThreadImplement());
        th2.setName("쓰레드2");
        th1.start();        
        th2.start();
        System.out.println("메인 쓰레드 작업 종료");
    }
}

class ThreadExtend extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " 작업 시작");    
        for(int i = 0; i<10000; i++){
            
        }
        System.out.println(Thread.currentThread().getName() + " 작업 끝");            
        System.out.println(Thread.currentThread().getName() + " 오류 발생");
        throwException();        
    }
    
    public void throwException(){
        try{
            throw new Exception();            
        } catch(Exception e){
            e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + " 오류 캐치");            
        }
    }
}

class ThreadImplement implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " 작업 시작");    
        for(int i = 0; i<100000; i++){
            
        }
        System.out.println(Thread.currentThread().getName() + " 작업 끝");    
        
    }
}