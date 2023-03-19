class Tv{
    //member variable
    String color;
    boolean power;
    int channel;
    
    //method
    void power()        {power = !power;}
    void channelUp()    {channel += 1;}
    void channelDown()  {channel -= 1;}
}

class ClassAndObject{
    public static void main(String[] args){ 
    //ClassAndObject 클래스 내부의 main 메서드는 전역에서 접근 가능하며 static 영역에 메모리가 할당되고 리턴값이 없으며 문자열을 인자로 받아 배열로 사용할 것이다.
        Tv telev = new Tv();
        telev.channel = 10;
        telev.channelUp();
        System.out.println(telev.channel);
        
        telev.power = false;
        telev.power();
        System.out.println(telev.power);
        
        
        
        //객체 배열
        Tv tv1, tv2, tv3;
        
        Tv[] tvArr = new Tv[3];
        tvArr[0] = tv1;
        tvArr[1] = tv2;
        tvArr[2] = tv3;
        
        //간단하게 선언
        
        Tv[] tvSimpleArr = {new Tv(), new Tv(), new Tv()};
    }
}