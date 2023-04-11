import java.util.*;
class ArrayListExample2{
    public static void main(String[] args){
        final int LIMIT = 10;
        String source = "0123456789ABCDEFGHIdassfdgvlnefjgverdaf";
        List list = new ArrayList(source.length() / LIMIT + 20);
        
        for (int i = 0; i < source.length(); i+=LIMIT){
            if(i+LIMIT < source.length()){
                list.add(source.substring(i,i+LIMIT));
            } else{
                list.add(source.substring(i));
            }
        }
        
        System.out.println(list);
    }
}