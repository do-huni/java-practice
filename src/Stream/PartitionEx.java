import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student{
    //Instance Variables
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;
    
    //Constructors
    Student(String name, boolean isMale, int hak, int ban, int score){
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }
    
    //Methods
    ///Getter
    String getName()    {return name;}
    boolean isMale()    {return isMale;}
    int getHak()        {return hak;}
    int getBan()        {return ban;}
    int getScore()      {return score;}
    
    @Override
    public String toString(){
        return String.format("[%s, %s, %d학년, %d반, %3d점]", name, ((isMale) ? "male" : "female"), hak, ban, score);
    }
    
    enum Level {HIGH,MID,LOW};
    
}

class PartitionEx{
    public static void main(String[] args){
        Student[] stuArr = {
            new Student("나자바", true, 1, 1, 300),
            new Student("김자스", true, 1, 1, 250),
            new Student("황자바", true, 1, 1, 200),
            new Student("석자바", false, 1, 2, 150),
            new Student("김자바", true, 1, 2, 150),
            new Student("김김김", false, 1, 2, 50),
            new Student("황민수", false, 1, 3, 100),
            new Student("진현기", false, 1, 3, 150),
            new Student("안해", true, 1, 3, 200),
            
            new Student("귀찮다", true, 2, 1, 300),
            new Student("이름이", false, 2, 1, 250),
            new Student("중요해?", true, 2, 1, 200),
            new Student("데이터", false, 2, 2, 150),
            new Student("자동으로", false, 2, 2, 100),
            new Student("만들어줘", true, 2, 2, 50),
            new Student("난혼자", true, 2, 3, 10)
        };
        
        System.out.printf("1. 단순분할(성별로 분할)\n");
        Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr)
            .collect(partitioningBy(Student::isMale));
        List<Student> maleStudent = stuBySex.get(true);
        List<Student> femaleStudent = stuBySex.get(false);
        
        for(Student s : maleStudent) System.out.println(s);
        for(Student s : femaleStudent) System.out.println(s);
        
        System.out.printf("2. 단순분할 + 통계(성별 학생수)\n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
            .collect(partitioningBy(Student::isMale, counting()));
        System.out.println("남학생 수:" + stuNumBySex.get(true));
        System.out.println("여학생 수:" + stuNumBySex.get(false));
        
        System.out.printf("3. 단순분할 + 통계(성별에서 1등)\n");
        Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
            .collect(partitioningBy(Student::isMale,
                    maxBy(comparingInt(Student::getScore))));
        System.out.println("남학생 1등:" +topScoreBySex.get(true).get());
        System.out.println("여학생 1등:" +topScoreBySex.get(false).get());
        
        System.out.printf("4. 다중분할(성별 불합격자, 100점 이하)\n");
        
        Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex =
            Stream.of(stuArr).collect(partitioningBy(Student::isMale,
                                                    partitioningBy(n -> n.getScore() <= 100)
                                                     ));
        List<Student> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student> failedFemaleStu = failedStuBySex.get(false).get(true);
        for(Student s : failedMaleStu)    System.out.println(s);
        for(Student s : failedFemaleStu)    System.out.println(s);
    }
    
}