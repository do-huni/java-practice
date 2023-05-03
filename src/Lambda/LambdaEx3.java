import java.util.*;
import java.util.function.*;

class LambdaEx3{
    public static void main(String[] args){
        Supplier<Integer> s = () -> (int)(Math.random()*100) + 1;// 1~100사이의 정수 값 반환
        //IntSupplier s = () -> (int)(Math.random()*100) +1;
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i%2==0;
        Function<Integer, Integer> f = i -> i/10*10; // 1의자리 삭제함!! / 연산자의 특성 활용
        
        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList.toString());
        
        
    }
    
    static <T> List<T> doSomething(Function<T, T> f, List<T> list) { //메서드에서 T객체를 쓸거다. T형 리스트를 반환하는 이 메서드는 반환타입과 매개변수가 T인 람다함수 f와 T형 리스트를 매개변수로 사용한다.
        List<T> newList = new ArrayList<T>(list.size()); //입력으로 사용된 리스트와 같은 사이즈의 ArrayList를 만들고 부모클래스인 List 참조변수로 참조한다.
        
        for (T i : list){ //입력된 list의 요소 개별 반복
            newList.add(f.apply(i)); //새로 만든 리스트에 람다식을 적용하고 추가한다.
        }
        
        return newList;
    }
    
    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){
        System.out.print("[");
        for(T i : list){ 
            if(p.test(i)) //조건 람다식 p에서 true가 나오는 놈들만
                c.accept(i); //출력값이 없는 람다식 c를 수행
        }
        System.out.println("]");
    }
    
    static <T> void makeRandomList(Supplier<T> s, List<T> list){
        for(int i = 0; i<10; i++){
            list.add(s.get());
        }
    }
}