import java.util.*;
class PriorityQueueEx{
    public static void main(String[] args){
        Queue pq = new PriorityQueue();
        pq.offer(3);
        pq.offer(2);
        pq.offer(10);
        pq.offer(1);
        System.out.println(pq);
        
        Object obj = null;
        while((obj = pq.poll()) != null){
            System.out.println(obj);
        }
    }
}


