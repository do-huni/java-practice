import java.util.*;

class LinkedVsArray{
    public static void main(String[] args){
        ArrayList a1 = new ArrayList(2000000);
        LinkedList l1 = new LinkedList();
        
        System.out.println("== 순차적으로 추가하기 ==");
        add1(a1); //1192
        add1(l1); //1194
        System.out.println("== 중간에 추가하기 ==");
        add2(a1); //11900
        add2(l1); //100
/* 제거의 경우도 비슷한 결과를 보여줌.
크기가 작은 경우에는 ArrayList도 속도가 그리 느리지 않은 편.
중간에 추가하는 경우가 LinkedList에서 빠르게 작동하는 이유: 요소간 연결만 바꾸면 됨.
<->ArrayList에서 느린 이유: 값을 삭제하고 빈공간을 요소를 재배치해 채워야하기 때문.
*/
        System.out.println("== 접근시간 테스트 ==");
        access(a1); //1
        access(l1); //401
/* 반면 access 속도는 ArrayList가 더 빠름.
LinkedList는 인덱스에 접근하기위해 처음부터 주소를 타고타고 들어가야하기 때문.
ArrayList는 이미 인덱스에 해당하는 주소를 확보해서 잡아놓기 때문에 한번에 접근 가능.
*/
        
//서로 쉽게 형변환 가능. 값 저장에는 Array 사용, 데이터 작업에는 Linked 사용.        
        LinkedList l2 = new LinkedList(a1);
        ArrayList a2 = new ArrayList(l1);
    }
    
    public static void add1(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i<1000000; i++){
            list.add(i+"");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    
    public static void add2(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            list.add(500, "X");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }    
    
    public static void access(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }    
}