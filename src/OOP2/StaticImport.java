import static java.lang.System.out;
import static java.lang.Math.*; //Math클래스의 모든 static 멤버들
//static import문을 선언할 경우 특정 클래스의 static멤버를 호출할 때 클래스 이름을 생략할 수 있다.

class StaticImport{
    public static void main(String[] args){
        out.println("이렇게 간단하게 프린트 가능");
        out.println(random());
        out.println(PI);
    }
}