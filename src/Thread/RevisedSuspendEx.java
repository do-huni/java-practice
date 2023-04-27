class RevisedSuspendEx{
    public static void main(String[] args){
        CustomThread th1 = new CustomThread("*");
        CustomThread th2 = new CustomThread("**");
        CustomThread th3 = new CustomThread("***");
        
        th1.start();
        th2.start();
        th3.start();
        
        try{
            Thread.sleep(2000); //main method sleep
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch(InterruptedException e){}
    }
}

class CustomThread implements Runnable{
    volatile boolean suspended = false;
    volatile boolean stopped = false;
    
    Thread th;
    
    CustomThread(String name){
        th = new Thread(this, name); //Thread(Runnable r, String name);
    }
    
    public void run(){
        while(!stopped){
            if(!suspended){
                System.out.println(Thread.currentThread().getName());                
                
                try{
                    Thread.sleep(1000);                    
                } catch(InterruptedException e){
                    System.out.println(Thread.currentThread().getName() +  " - interruption occured. escaping from sleep status");
                } //end of try
            } else{
                //System.out.println(Thread.currentThread().getName() + " - yield resources");
                Thread.yield();
            } //end of if
            
        } //end of while
        System.out.println(Thread.currentThread().getName() + " - stopped");
    } //end of method
    
    public void suspend() {
        System.out.println(th.getName() + " - suspended()");
        suspended = true;
        th.interrupt();
    }
    public void resume()  { suspended = false;}
    public void stop()    { stopped = true;
                          th.interrupt();}
    public void start()   { th.start(); }
}//end of class