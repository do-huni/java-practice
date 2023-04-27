class GarbageCollectorEx{
    public static void main(String[] args){
        CustomThread gc = new CustomThread();
        
        gc.setDaemon(true);
        gc.start();
        
        int requiredMemory = 0;
        
        for(int i = 0; i<50; i++){
            requiredMemory = (int)((Math.random()) * 10 +1) * 20; //20~200
            if(gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4){                
                gc.interrupt();
                try{
                    gc.join(100); //gc가 작업할 시간동안 휴식
                } catch(InterruptedException e) {}
            }
            
            gc.setUsedMemory(gc.getUsedMemory() + requiredMemory);
            System.out.println("usedMemory: " + gc.getUsedMemory());
        }
        
    }
}

class CustomThread extends Thread{
    final static int MAX_MEMORY = 1000;
    private int usedMemory = 0;
    
    public void run(){
        while(true){
            try{
                Thread.sleep(10*1000);
            } catch(InterruptedException e){
                System.out.println("Awakended by Interrupt()");
            }
            
            this.gc();
            System.out.println("Garbage Collected. Free Memory: " + freeMemory());
        }
    }
    
    public void gc(){
        usedMemory -= 300;
        if (usedMemory < 0){
            usedMemory = 0;
        }
        

    }
    public int totalMemory() { return MAX_MEMORY; }
    public int freeMemory()  { return MAX_MEMORY - usedMemory; }   
    public int getUsedMemory(){
        return this.usedMemory;
    }
    public void setUsedMemory(int usedMemory){
        this.usedMemory = usedMemory;
    }
}