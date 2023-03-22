class Constructor{
    public static void main(String[] args){
        Data1 d1 = new Data1();
        /*Data2 클래스는 생성자가 짜여있기에 "Data2() {}"(기본 생성자)가 만들어지지 않은 상태*/
        //Data2 d2 = new Data2(); 에러
        Data2 d2 = new Data2(10);
        
        Car c1 = new Car();
        System.out.println("[c1]");
        System.out.println(c1.color);
        System.out.println(c1.gear);
        System.out.println(c1.door);
        
        Car c2 = new Car("green", "manual");
        System.out.println("[c2]");                           
        System.out.println(c2.color);
        System.out.println(c2.gear);
        System.out.println(c2.door);        
        
        Car c3 = new Car(c2);
        c3.door = 6;
        System.out.println("[c3]");                           
        System.out.println(c3.color);
        System.out.println(c3.gear);
        System.out.println(c3.door);           

    }
}

/*생성자가 없는 클래스의 경우 컴파일러가 클래스 명과 동일한 기본 생성자를 만들어줌*/
class Data1{
    int value;
}

/*생성자가 존재함으로 기본 생성자가 만들어지지 않음*/
class Data2{
    int value;
    Data2(int x){
        value = x;
    }
}

class Car{
    String color;
    String gear;
    int door;
    
    Car(String color, String gear, int door){
        this.color = color;
        this.gear = gear;
        this.door = door;
        //매개변수의 이름과 인스턴스변수명이 같을 때 this를 활용하면 인스턴스 자신을 가리킬 수 있다.
        //this <- 인스턴스 자신을 가리키는 "참조변수"
    }
    
    Car(){
        this("white", "auto", 4);
        //생성자에서 다른 생성자를 호출할 때 클래스 이름 대신 this를 할용한다.
        //this() 같은 클래스의 다른 생성자를 호출할 때 사용하는 "생성자"
    }
    
    Car(String color){
        this(color,"auto", 4);
    }
    Car(String color, String gear){
        this(color, gear, 4);
    }
    //생성자 활용 인스턴스 복제하기
    Car(Car c){
        this.color = c.color;
        this.gear = c.gear;
        this.door = c.door;
    }
}