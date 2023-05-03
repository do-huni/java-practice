import java.util.*;
import java.util.function.*;

class MethodReference{
    public static void main(String[] args){
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("10"));
        
        Function<String[], String> f1 = Arrays::toString;
        System.out.println(f1.apply((new String[] {"안녕","예이"})));
        
        BiFunction<Integer, String, MyClass> f2 = MyClass::new;
        f2.apply(10, "ss");
        
        Function<Integer, String[]> f3 = String[]::new;
        System.out.println(f1.apply(f3.apply(f.apply("8"))));
    }
}

class MyClass{
    MyClass() {};
    MyClass(int q, String w){};
}