import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.io.*;

class StreamEx2{
    public static void main(String[] args){
        //[Intermediate Operations]
        
        //skip & limit
        IntStream intStream = IntStream.rangeClosed(1,10);
        intStream.skip(3).limit(5).forEach(System.out::print);
        System.out.println();
        
        //filter & distinct
        intStream = IntStream.of(1,2,2,2,3,3,3,4,4,4,5,5,6);
        intStream.distinct().forEach(System.out::print);
        System.out.println();
        
        intStream = IntStream.range(0,31);
        intStream.filter(i -> i%2 == 0).filter(i -> i%3 == 0).forEach(System.out::print);
        System.out.println();
        
        //sorted
        Stream<String> strStream = Stream.of("dd","aaa","cc","CC", "b");
        strStream.sorted().forEach(System.out::print);
        System.out.println();
        
        //map
        /*
        Stream<R> map(function <? super T, ? extends R> mapper)
        T 또는 T의 부모 클래스로 구현된 스트림의 요소들을 R또는 R의 자식클래스로 변환한 Stream<R>을 반환한다.
        */
        Stream<File> fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.txt"), new File("Ex2.java"), new File("Ex1.py"), new File("Ex2.ipynb"));
        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        UnaryOperator<String> u1 = s -> s.substring(0, s.indexOf('.')); //파일명 부분만 뽑아내는 람다식
        
        fileStream = Stream.of(new File("Ex1.java"), new File("Ex1"), new File("Ex1.txt"), new File("Ex2.java"), new File("Ex1.py"), new File("Ex2.ipynb"));
        fileStream.map(File::getName) //Stream<File> -> Stream<String>
            .filter(s -> s.indexOf('.') != -1) //확장자가 없을 경우 제외함
            .peek(s-> System.out.printf("filename = %s\n", u1.apply(s))) // 중간 연산: 파일명 출력
            .map(s -> s.substring(s.indexOf('.') +1)) //확장자 부분만 추출
            .peek(s-> System.out.printf("extension = %s", s))
            .forEach(n -> System.out.println());
        
        
    }
}