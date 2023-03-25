class InterfaceExample{
    public static void main(String[] args){
        
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