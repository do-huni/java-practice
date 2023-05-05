import java.util.*;
import java.util.stream.*;

class StreamEx4{
    public static void main(String[] args){
        //Stream Final Operation
        String[] strArr = {
            "Inheritance", "Java", "Lambda", "Stream", "OptionalDouble", "IntStream", "Count", "Sum"
        };
        Stream.of(strArr).forEach(System.out::println);
        
        
        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr)
            .filter(s -> s.charAt(0) == 'S').findFirst();
        System.out.println(noEmptyStr);
        System.out.println(sWord.get());
    }
}