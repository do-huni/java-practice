import java.util.*;

class waitEx{
    public static void main(String[] args) throws Exception{
        Table table = new Table();
        
        new Thread(new Customer(table, "hamburger")).start();
        new Thread(new Customer(table, "pizza")).start();
        new Thread(new Customer(table, "chicken")).start();        
        new Thread(new Cook(table)).start();
        
        Thread.sleep(5000);
        System.exit(0);
    }
}

class Table{
    String[] dishNames = {"hamburger", "pizza", "chicken"};
    final int MAX_NUM = 6;
    
    private ArrayList<String> dishes = new ArrayList<String>();
    
    public synchronized void addDish(int dish){
        if (dishes.size() >= MAX_NUM){
            try{
                wait();
                Thread.sleep(500);
        } catch(InterruptedException e) {}}
        
        this.dishes.add(dishNames[dish]);    
        notify();            
        System.out.println("dishes: " + dishes.toString());
    }
    
    public boolean removeDish(String food){
        synchronized(this){
            for(int i = 0; i<dishes.size(); i++){
                if(dishes.get(i) == food){
                    dishes.remove(i);
                    return true;
                }
            }
            return false;
        }
        
    }
}

class Customer implements Runnable{
    private Table table;
    private String food;
    Customer(Table table, String food){
        this.table = table;
        this.food = food;
    }
    
    public void run(){
        while(true){
            try{Thread.sleep(10);} catch(InterruptedException e) {}
            String name = Thread.currentThread().getName();
            if(table.removeDish(food)){
                System.out.println(name + " ate " + food);
            } else{
                //System.out.println(name + " failed to eat " + food);                
            }
        }
    }
}

class Cook implements Runnable{
    private Table table;
    
    Cook(Table table){
        this.table = table;
    }
    
    public void run(){
        while(true){
            try{Thread.sleep(100);} catch(InterruptedException e) {}
            String name = Thread.currentThread().getName();
            int idx = (int)(Math.random()*3);
            table.addDish(idx);
            System.out.println(name + " add " + idx);
        }
    }    
}