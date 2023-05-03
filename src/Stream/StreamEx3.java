import java.util.*;
import java.util.stream.*;

class StreamEx3{
    public static void main(String[] args){
        //flatMap
        Stream<String[]> strArrStream = Stream.of(
        new String[]{"abc", "def", "jkl"},
        new String[]{"ABC", "GHI", "JKL"});
        
        Stream<String> strStream = strArrStream.flatMap(Stream::of);
        strStream.map(String::toLowerCase)
            .distinct()
            .sorted()
            .forEach(System.out::println);
        
        System.out.println("======================");
        
        String[] lineArr = {
            "Believe or not It is true",
            "Do or do not There is no try",
        };
        
        Stream<String> lineStream = Stream.of(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
            .map(String::toLowerCase)
            .distinct()
            .sorted()
            .forEach(System.out::println);
        
        System.out.println("======================");

        Stream<String> strStream1 = Stream.of("AAA","ABC", "bBb", "Dd");
        Stream<String> strStream2 = Stream.of("bbb","aaa","ccc","dd");
        
        Stream<Stream<String>> strStreamStream = Stream.of(strStream1, strStream2);
        Stream<String> strStreamFlat = strStreamStream
            .map(s -> s.toArray(String[]::new)) //Stream을 Array로 변환
            .flatMap(Arrays::stream); //Stream<String[]> -> Stream<String>
        strStreamFlat
            .map(String::toLowerCase)
            .distinct()
            .sorted()
            .forEach(System.out::println);
    }
}