import java.util.*;
import java.util.function.*;

class JavaUtilFunction{
    public static void main(String[] args){
        //Predicate<T>: 조건문 표현에 사용됨 / .test()
        Predicate<String> isEmptyStr = s -> s.length()==0;
        String s = "";
        if(isEmptyStr.test(s)){
            System.out.println("빈 문자열입니다.");
        }

        //Supplier<T>: 매개변수 X, 반환타입 T / .get()
        Supplier<Double> getPI = () -> 3.14;
        System.out.println(getPI.get());
        
        //Consumer<T>: 매개변수 O, 반환타입 X / .accept(T t)
        Consumer<String[]>printStrArray = arr -> {
            for(String i : arr){
                System.out.println(i);
            }
        };
        String[] arr = {"안녕", "나는", "한별이야"};
        printStrArray.accept(arr);
        
        //Function<T, R>: 매개변수 O, 반환타입 O / .apply(T t)
        Function<Integer, Integer> doubled = n -> n*2;
        System.out.println(doubled.apply(10));
        
        //UnaryOperator<T>: 매개변수 == 반환타입(extends Function) / .apply(T t)
        UnaryOperator<Integer> doubledV2 = n -> n*2;
        System.out.println(doubledV2.apply(30));
        //Bi(Function): 매개변수가 둘
        //BiPredicate
        BiPredicate<Integer, Integer>compare = (n, m) -> (n>m);
        if(compare.test(10,20)){
            System.out.println("첫번째 매개변수가 더 큽니다.");
        } else{
            System.out.println("두번째 매개변수가 더 큽니다.");
        }
        //BiConsumer
        BiConsumer<Integer, String>printStringTimes = (n, m) -> {
            for(int i = 0; i<n; i++){
                System.out.println(m);
            }
        };
        printStringTimes.accept(4, "반복");
        //BiFunction
        BiFunction<Integer,int[], Integer> matcher = (n, m) -> m[n];
        System.out.println(matcher.apply(1,(new int[]{6,2,3,10})));
        //BinaryOperator
        BinaryOperator<Integer>hx = (n, m) -> 3*n + 10*m + 6;
        System.out.println(hx.apply(5,6));
    }             
}