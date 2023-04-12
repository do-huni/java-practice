import java.util.*;

public class StackAndQueue{
    public static void main(String[] args){
        
        runStackExample();
        
        runQueueExample();
    }
    
    public static void runStackExample(){
        System.out.println("========= runStackExample =========");
        Stack st = new Stack();
        st.push("0");
        st.push("1");
        st.push("2");
        
        while(!st.empty()){
            System.out.println(st.pop());
        }
    }
    
    public static void runQueueExample(){
        System.out.println("========= runQueueExample =========");        
        Queue q = new LinkedList();
        q.offer("0");
        q.offer("1");
        q.offer("2");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}