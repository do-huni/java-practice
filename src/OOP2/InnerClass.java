class InnerClass{
    public static void main(String[] args){
        Outer o1 = new Outer();
        o1.a1.hello();
    }
}


class Outer{
    class InstanceInner{
        final static int staticFinalVal = 3; //final static은 상수이므로 가능.
    } //인스턴스 내부 클래스
    static class StaticInner{
        static int staticVal; //스태틱 내부 클래스만 스태틱 멤버를 가질 수 있음.
    } //스태틱 내부 클래스
    
    Anonymous a1 = new Anonymous(){ void hello(){System.out.println("hello");}};
    //익명클래스의 선언이 추상클래스를 구체화 하는 모습을 확인 할 수 있다. 따라 익명 클래스는 일종의 상속 개념과 유사하다 볼 수 있다.
    
    void MyMethod(){
        class LocalInner{} //로컬 내부클래스
    }
}

abstract class Anonymous{
    abstract void hello();
}