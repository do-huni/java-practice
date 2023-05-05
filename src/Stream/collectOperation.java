import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;


class collectOperation{
    public static void main(String[] args){

        Student[] stuArr = {
        new Student("김자바", 1, 100),
        new Student("석자바", 1, 100),
        new Student("안자바스크립트", 2, 82),
        new Student("안자바", 2, 84),
        new Student("김파이썬",1,89),
        new Student("임루비",2, 63),
        new Student("난스프링",3,91),
        new Student("김노드", 2, 18)};        
        
        List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);
        
        String[] namesArr = names.stream()
            .toArray(String[]::new);
        for (String i : namesArr){
            System.out.println(i);
        }
        
        Map<String, Student> stuMap = Stream.of(stuArr)
            .collect(toMap(s-> s.getName(), p -> p));
        for(String name: stuMap.keySet()){
            System.out.println(name + ": " + stuMap.get(name));
        }
        
        long count = Stream.of(stuArr).collect(counting());
        long totalScore = Stream.of(stuArr).collect(summingInt(Student::getTotalScore));
        System.out.println("count: " + count);
        System.out.println("totalScore: " + totalScore);
        
        totalScore = Stream.of(stuArr)
            .collect(reducing(0, Student::getTotalScore, Integer::sum));
        
        Optional<Student> topStudent = Stream.of(stuArr)
            .collect(maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println("topStudent: " + topStudent);
        
        IntSummaryStatistics stats = Stream.of(stuArr)
            .collect(summarizingInt(Student::getTotalScore));
        System.out.println(stats);
        
        String joinedName = Stream.of(stuArr)
            .map(Student::getName).collect(joining(",", "(optional)startString //","// (optional)endString"));
        System.out.println("joinedName: " + joinedName);
    }
}


class Student implements Comparable<Student>{
    String name;
    int cl;
    int totalScore;
    
    Student(String name, int cl, int totalScore){
        this.name = name;
        this.cl = cl;
        this.totalScore = totalScore;
    }
    
    public String toString(){
        return String.format("[%s, %d, %d]", name, cl, totalScore).toString();
    }
    
    String getName()    {return name;}
    int getCl()    {return cl;}
    int getTotalScore()    {return totalScore;}
    
    public int compareTo(Student s){
        return s.totalScore - this.totalScore;
    }
}