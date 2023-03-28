class InterfaceExample{
    public static void main(String[] args){
        Tank t1 = new Tank( 30 );
        System.out.println(t1.isGroundUnit());
        SCV scv1 = new SCV( 20 );
        t1.damaged(10);
        scv1.repair(t1);
    }
}

/*
[인터페이스 조건]]
모든 멤버 변수는 public static final 이어야 함. (생략가능)
모든 메서드는 public abstract 이어야 함. (생략가능)
(JDK 1.8 ~) static 메서드, default 메서드는 예외
*/
interface PlayingCard {
    public static final int SPADE = 4; //이렇게 쓰나
    final int DIAMOND = 3; //이렇게 쓰나
    static int HEART = 2; //이렇게 쓰나
    int CLVOER = 1; //이렇게 쓰나 전부 다 그냥 public static final int
    
    public abstract String getCardNumber();
    String getCardKind();// 이렇게 써도 public abstract String
    
}

//실습예제

class Unit {
    int hp;
    final int MAXHP;
    Unit(int hp){
        this.hp = hp;
        this.MAXHP = hp;
    }
    void damaged(int damage){
        this.hp -= damage;
        if (this.hp < 1){
            System.out.println("객체가 사망했습니다.");
        }
    }
    Boolean isGroundUnit(){
        return (this instanceof GroundUnit);
    }    
    Boolean isAirUnit(){
        return (this instanceof AirUnit);
    }    
}

class GroundUnit extends Unit{
    GroundUnit(int hp)    { super(hp); }
}

class AirUnit extends Unit{
    AirUnit(int hp)       { super(hp); }
}

class Tank extends GroundUnit implements Repairable{
    Tank(int hp)     { super(hp); }
}

class Marine extends GroundUnit{
    Marine(int hp)     {super(hp);}
}

class SCV extends GroundUnit implements Repairable{
    SCV(int hp)        {super(hp);}
    
    void repair(Repairable r){
        if (r instanceof Unit){
            Unit u = (Unit) r;
            System.out.printf("현재 체력 %d, 최대 체력: %d 수리를 시작합니다.\n", u.hp, u.MAXHP);            
            while (u.hp < u.MAXHP){
                u.hp++;
            }
            System.out.printf("현재 체력 %d, 최대 체력: %d 수리가 끝났습니다.\n", u.hp, u.MAXHP);
        }
    }
}

interface Repairable{
    
}