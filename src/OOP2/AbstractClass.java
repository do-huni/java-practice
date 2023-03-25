class AbstractClass{
    public static void main(String[] args){
        Onion o1 = new Onion();
        System.out.println(Onion.type);
        o1.from();
        o1.printName();
        o1.setLocation("워크인 냉장고");
        o1.info();
    }
}

abstract class Food{
    //클래스 변수 구현 가능
    static String type;
    //인스턴스 변수 구현가능
    String name;
    int val;
    int due;
    
    //생성블럭
    static{
        type = "food";
    }
    {
        this.name = getClass().getName();
    }
    
    //메서드
    void from(){
        System.out.println("food 추상클래스의 자손입니다.");
    } //추상클래스도 일반메서드 구현 가능    
    
    void printName(){
        System.out.println(this.name);
    } //선언부와 구현부가 모두 공통적일 경우 일반메서드로 구현하고 상속시킨다.
    
    //추상메서드
    abstract void info(); //구현부가 다른 경우 추상메서드로 정의한다.
    
}

class Onion extends Food{
    
    private String location;
    
    Onion()        {this(10, 20230102);}
    Onion(int val, int due){
        this.val = val;
        this.due = due;
    }
    
    void setLocation(String loc){
        this.location = loc;
    }
    
    void info(){
        System.out.printf("이 개체의 종류는 %s이며 %dkg의 무게를 지녔습니다.\n현재 %s에 위치 중이며 유통기한은 %d입니다.", this.name, this.val, this.location, this.due);
    }
}