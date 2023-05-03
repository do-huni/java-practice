import java.util.*;
import java.util.function.*;

class LambdaComposition{
    public static void main(String[] args){
        Function<String, Integer> f = s -> Integer.parseInt(s, 16); //문자열->숫자
        Function<Integer, String> g = i -> Integer.toBinaryString(i);//숫자->2진문자열
        
        System.out.println((f.andThen(g)).apply("ff"));
        Function<String,String> h = g.compose(f);
        System.out.println(h.apply("ff"));
        
        //항등함수 I
        Function<Integer, Integer> I = Function.identity();
        System.out.println(I.apply(12321));
        
        //Predicate 결합. && || 같은 논리연산자와 유사한 기능을 한다고 보면 됨.
        
        Predicate<Integer> p = i -> i <100;
        Predicate<Integer> q = i -> i <200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer>notP = p.negate();
        
        Predicate<Integer>condition = notP.and(q.or(r));
        
        System.out.println(condition.test(150));
        
        Predicate<Double>eq = Predicate.isEqual(3.14);
        System.out.println(eq.test(3.14));

    }
}