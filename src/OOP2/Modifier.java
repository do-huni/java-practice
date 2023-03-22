class Modifier{
    public static void main(String[] args){
        System.out.println(StaticClass.width);
        
        /* [접근 제어자] */
        //[private]: 같은 클래스 내에서만 접근 가능
        //[default]: 같은 패키지 내에서만 접근 가능
        //[protected]: 같은 패키지 내에서 or 다른 패키지의 자손클래스에서 접근 가능
        //[public]: 어디서나 접근 가능
        
        /*
        접근 제어자를 사용하는 이우
        - 외부로부터 데이터 보호
        - 외부에는 불필요한 내부적으로만 사용되는 부분을 감추기 위해
        => 캡슐화
        */
        
        Time t = new Time();
        t.setHour(28);
        System.out.println(t.getHour());
        t.setHour(21);
        //System.out.println(t.hour); 엑세스 불가능
        System.out.println(t.getHour());
        
        LimitGen limit = LimitGen.getInstance();
        limit.val = 2;
        LimitGen limit2 = LimitGen.getInstance();
        System.out.println(limit2.val);
        //이 방식의 단점 -> 인스턴스가 static이라 몇개를 생성하든 같은 인스턴스를 참조하게 된다. 따라 멤버변수의 값도 모두 같은 값을 가진다.
    }
}
//static - 클래스의, 공통적인
//[멤버변수] [초기화 블럭] [메서드]
class StaticClass{
    static int width = 200; //[멤버변수] 클래스 변수
    static int height = 120; //[멤버변수] 클래스 변수
    
    static{
        for(int i = 0; i<10; i++){
            width += 1;
        }
    } //[초기화 블럭] 클래스 변수 초기화
    
    static int max(int a, int b){ //[메서드] 클래스 메서드
        return a > b ? a : b;
    }
}

//final - 마지막의, 변경될 수 없는
//[클래스] [멤버변수] [지역변수] [메서드]
final class FinalClass{ //[클래스] 조상이 될 수 없는 클래스
    final int MAX_SIZE = 10; //[멤버변수] 상수(값 변경 불가))
    
    final int getMaxSize() { //[메서드] 오버라이딩 불가능한 메서드(변경불가)
        final int LV = MAX_SIZE; //[지역변수] 상수 지역변수
        return MAX_SIZE;
    }
}

//abstract - 추상의, 미완성의 (상속을 통해서 완성되어야 한다)
//[클래스] [메서드]
abstract class AbstractClass{ //[클래스] 클래스 내에 추상 메서드가 선언되어 있음을 알림
    abstract void move(); //[메서드] 구현부가 없는 메서드
}

class Time{
    private int hour;
    private int minute;
    private int second;
    
    public int getHour() {
        return this.hour;
    }
    //멤버 변수를 private으로 설정하고 멤버 변수 값을 변동시키는 메서드를 통해 값을 입력 받는다.
    //메서드 입력값에 제한을 걸어 hour 변수의 입력값을 보호한다.
    public void setHour(int hour){
        if (hour < 0 || hour > 23){
            return;
        }
        this.hour =hour;
    }
}

final class LimitGen{ //생성자가 private이면 자손클래스에서 조상 클래스의 생성자를 호출 못하므로 상속이 불가능함. 따라 final을 붙여서 상속 불가능 클래스임을 명시
    
    int val = 1;
    private static LimitGen g = new LimitGen(); //미리 인스턴스를 생성해둬야 함으로 static.
    private LimitGen(){}; //생성자를 보호. 밖에서 이 클래스를 생성할 수 없다.
    
    public static LimitGen/*리턴타입: 해당 클래스*/ getInstance(){
        return g;
    }
}