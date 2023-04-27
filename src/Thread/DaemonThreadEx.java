import java.util.*;
class DaemonThreadEx{
    public static void main(String[] args){
        Thread th1 = new Thread(new CustomThread());
        th1.start();
    }
}

class Results extends ArrayList{
    private static ArrayList<String> result = new ArrayList<String>();
    private static ArrayList<String> templist = new ArrayList<String>();
    
    public static void addTempMember(String member){
        templist.add(member);
    }
    
    public static void synchronizeResult(){
        result = templist;
    }
    
    public static ArrayList<String> getResult(){
        return result;
    }
    public static Iterator getIterator(){
        return result.iterator();
    }
}
class CustomThread implements Runnable{
    
    public void run(){
        Thread t1 = new Thread(new customDaemonThread());
        t1.setDaemon(true);
        t1.start();
        
        Scanner s1 = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String input = s1.nextLine();
            if(input.equals("q")){
                System.exit(0);
            }            
            if(input.equals("")){
                continue;
            }
            if(input.equals("print")){
                /* 출력 */
                Iterator it1 = Results.getIterator();
                while(it1.hasNext()){
                    System.out.println(it1.next());
                }
                continue;
            }
            Results.addTempMember(input);            
        }
    }
}

class customDaemonThread implements Runnable{
    boolean autoSave = true;
    
    public void setAutoSave(boolean on){
        autoSave = on;
    }
    
    public void run(){
        /* process */
        while(true){
            try{
                Thread.sleep(10*1000);
            } catch(Exception e){}
            if(autoSave){
                autoSave();
            }
        }
    }
    
    public void autoSave(){
        System.out.print("자동저장되었습니다.\n>>");
        Results.synchronizeResult();
    }
}

