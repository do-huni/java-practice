import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class StreamSortingEx{
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
        
        /*
        IntStream scoreStream = studentStream.mapToInt(Student::getTotalScore);
        long scoreSum = scoreStream.sum();
        System.out.println(scoreSum);
        이렇게 하면 Stream이 닫히기 때문에 불편함
        */
        Stream<Student> studentStream = Stream.of(stuArr);
        
        IntSummaryStatistics stat = studentStream.mapToInt(Student::getTotalScore).summaryStatistics();
        System.out.printf("count: %d\n", stat.getCount());
        System.out.printf("sum: %d\n", stat.getSum());
        System.out.printf("avg: %f\n", stat.getAverage());
        System.out.printf("min: %d\n", stat.getMin());
        System.out.printf("max: %d\n", stat.getMax());
        
        studentStream = Stream.of(stuArr);
        studentStream.sorted(Comparator.comparing(Student::getCl)
                            .thenComparing(Comparator.naturalOrder())).forEach(Student::printInfo);
    }
}

class Student implements Comparable<Student>{
    //instance variables
    private String name;
    private int cl;
    private int totalScore;
    
    //constructors
    Student(String name, int cl, int totalScore){
        this.name = name;
        this.cl = cl;
        this.totalScore = totalScore;
    }
    Student(){
        this("홍길동", 1, 0);
    }
    
    //methods
    //getter
    public String getName() {return name;}
    public int getCl() {return cl;}
    public int getTotalScore() {return totalScore;}
    
    public int compareTo(Student s){
        return s.totalScore - this.totalScore;
    }
    public void printInfo(){
        System.out.printf("이름: %s, 반: %d, 점수: %d\n", this.getName(), this.getCl(), this.getTotalScore());
    }
}