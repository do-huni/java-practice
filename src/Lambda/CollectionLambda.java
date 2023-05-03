import java.util.*;


class CollectionLambda{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<10; i++){
            list.add(i);
        }
        
        list.forEach(n -> System.out.println(n));                     
        list.removeIf(n-> n % 2 == 0);
        list.replaceAll(n-> n*10);
        System.out.println(list.toString());
        
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        
        for(int i = 0; i<20; i++){
            final int k = i;
            map.computeIfAbsent(String.valueOf(i), n -> k*3);
        }
        System.out.println(map);
    }
}