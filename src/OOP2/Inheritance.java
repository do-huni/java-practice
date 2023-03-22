class Inheritance{
    public static void main(String[] args){
        //인스턴스 생성자 복습
        Tv television = new Tv();
        System.out.println(television.power);
        
        //상속관계
        CaptionTv capTv = new CaptionTv();
        System.out.println(capTv.channel);
        capTv.channelUp();
        System.out.println(capTv.channel);
        capTv.caption = true;
        capTv.displayCaption("Hello, world!");
        System.out.printf("Tv.bool: %b\n",Tv.bool);    
        Tv.bool = false;
        System.out.println("클래스변수 tv.bool 값을 false로 변경");
        System.out.printf("capTv.bool: %b\n",capTv.bool);
        capTv.caption = capTv.bool;
        capTv.displayCaption("Hello, world!"); //출력안됨
        System.out.println("=====================================");
    }
}

class Tv{
    static{
        bool = true;
    }
    {
        this.power = true;
        this.channel = 21;
    }
    boolean power;
    static boolean bool;
    int channel;
    
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if (caption){
            System.out.println(text);
        }
    }
}