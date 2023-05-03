import java.util.*;
import java.util.stream.*;
import java.util.function.*;


class StreamEx1{
    public static void main(String[] args){
        //[스트림 생성]                
        //Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        Stream<Integer> intListStream = list.stream();
        
        intListStream.forEach(System.out::print); //n -> System.out.print(n);
        System.out.println();
        //최종연산인 forEach가 수행되었음. intListStream이 닫히며 재호출 불가능.
        
        //Arrays
        Stream<String> strArrayStream = Stream.of("a","b","c"); //가변인자
        strArrayStream = Stream.of(new String[]{"a","b","c"});
        strArrayStream = Arrays.stream(new String[]{"a","b","c"});
        strArrayStream = Arrays.stream(new String[]{"a","b","c"}, 0, 3); //범위지정
        
        //기본형 스트림 선언
        IntStream intArrayStream = IntStream.of(1,2,3,4,5,6,7,8);        
        intArrayStream = IntStream.of(new int[]{1,2,3,4,5,6,7,8});
        
        strArrayStream.forEach(System.out::print);
        System.out.println();        
        intArrayStream.forEach(System.out::print);
        System.out.println();
        
        //IntStream/LongStream -> ramge/rangeClosed methods
        IntStream intRangeStream = IntStream.range(0, 10); //0123456789
        LongStream longRangeClosedStream = LongStream.rangeClosed(0, 10); //012345678910
        intRangeStream.forEach(System.out::print);
        System.out.println();
        longRangeClosedStream.forEach(System.out::print);
        System.out.println();
        
        //Random Number Infinite Stream
        IntStream intRandomNumberStream = new Random().ints(0, 21); //Random Class에서 ints() Method 호출
        intRandomNumberStream.limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        DoubleStream doubleLimitedRandomNumberStream = new Random().doubles(10, 0, 21); //method의 매개변수를 3개로 하면 범위 지정 가능
        doubleLimitedRandomNumberStream.forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        //Stream.iterate() / generate() : 람다식 -> 무한스트림
        /*
        [class Stream]
        static <T> Stream<T> iterate(T seed, unaryOperator<T> f)
        seed에 대하여 f를 무한 수행
        static <T> Stream<T> generate(Supplier<T> s)
        s의 리턴값을 무한 반환
        */
        Stream<Integer> evenStream = Stream.iterate(0, n->n+2);
        evenStream.limit(10).forEach(n -> System.out.print(n + " "));
        
        Stream<Integer> zeroStream = Stream.generate(() -> 0);
        IntStream zeroIntStream = zeroStream.mapToInt(Integer::valueOf); //형변환
        zeroIntStream.limit(10).forEach(System.out::print);
        System.out.println();
        
        Stream.generate(Math::random).limit(10).forEach(n -> System.out.print(n + " "));
        System.out.println();
                
        Stream emptyStream = Stream.empty();
        
        //Stream Connection
        Stream<Integer> listStream2 = Stream.of(new Integer[]{1,2,3,4,65,9999});
        Stream<Integer> intRandomNumberStream2 = new Random().ints(10, 0, 101).mapToObj(i -> i);
        
        Stream<Integer> connectedStream = Stream.concat(listStream2, intRandomNumberStream2);
        connectedStream.forEach(n->System.out.print(n + " "));
        System.out.println();
                
    }
}