import java.util.*;
import java.util.stream.*;

class OptionalEx{
    public static void main(String[] args){
                
        /*
        [Optional Object]
        public final class Optional<T> {
        private final <T> value;
        ...methods
        }
        T타입의 객체를 감싸는 wrapper class.
        모든 타입의 객체를 다 담을 수 있음.
        Optional에 저장 시 장점: 반환 값이 null인 지 if문으로 체크 할 필요 X. 객체 내 메서드를 통해 간결하게 처리 가능.    
        */
        
        Optional<String> optVal = Optional.of("abc");
        optVal = Optional.ofNullable(null); //null값이 있어도 NullPointerException 발생 X
        optVal = null; //null로 초기화
        optVal = Optional.<String>empty(); //빈 객체로 초기화. 보다 안전함. empty는 지네릭 메서드이기에 <T>가 붙음. 참조 변수를 통해 추정가능하므로 생략 가능
        
        optVal = Optional.ofNullable("abc");
        //String str1 = optVal.get(); null일 경우 예외 발생
        String str1 = optVal.orElse(""); // null일 경우 매개변수("")반환.
        
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());
        
        int result1 = Optional.of("123")
            .filter(x->x.length() > 0)
            .map(Integer::parseInt).get();
        int result2 = Optional.of("")
            .filter(x -> x.length() >0)
            .map(Integer::parseInt).orElse(-1);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        
        //이렇게도 가능
        Optional.of("456").map(Integer::parseInt)
            .ifPresent(x-> System.out.printf("result3 = %d\n", x));
        
        
    }
}