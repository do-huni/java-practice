import java.util.*;

class ArrayListExample{
    public static void main(String[] args){
        ArrayList list1 = new ArrayList(); //기본 크기: 10
        
        list1.add(new Integer(10));
        list1.add(10);
        list1.add(0);
        list1.add(20);        
        Collections.sort(list1);
        
        print(list1);
        System.out.println(list1.get(0).equals(list1.get(1)));
        
        ArrayList list2 = new ArrayList(list1);
        list1.add(2512);
        list1.add(35325435);
        list1.set(0,021302130); //기존의 index 0 값을 대체
        print(list1);
        print(list2);
        System.out.println(list1.containsAll(list2));
        list1.retainAll(list2); //메서드 수행 후 값의 변화가 있을 경우 return true
        print(list1);
        print(list2);
        //반복문 활용: 0부터 증가시킬경우 제거하면서 전체 길이가 바뀔 수 있으므로 뒤에서부터 인덱스를 줄여나가는 식으로 반복한다.
        for(int i = list2.size()-1; i >= 0; i--){
            if(list1.contains(list2.get(i))){
                list2.add(i + 5);
                list2.add(i + 10);
                list2.remove(i);
            }
        }
        print(list2);
    }
    
    static void print(ArrayList l1){
        System.out.println(l1);
    }
}