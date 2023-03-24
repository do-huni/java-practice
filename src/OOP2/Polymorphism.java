public class Polymorphism{
    public static void main(String[] args){
//         조상타입 -> 자손타입 형변환
        Car car = null;
        Amb a = new Amb();
        car = (Car)a;
        Amb amb = (Amb)car;
//         자손타입 -> 조상타입 형변환
        Car yeah = new Amb();
        yeah.go();
/*         조상타입 -> 자손타입 형변환 시 유의할 점
금지사항) 자손타입의 참조변수가 조상타입의 인스턴스를 갖는 것은 금지
Amb amb = new Car(); => 금지

상호 형변환은 자유로우나
Car car = New car;
Amb amb = (Amb)car => 금지
이유는 car이 참조하는 인스턴스가 Amb의 조상타입인 Car타입의 인스턴스이기 때문.

참조변수간의 형변환은 실제로 타입을 뜯어 바꾸는 게 아님.
참조하고 있는 인스턴스는 그대로인 채 참조 변수 타입만 바꾸어주는 것.
*/
        car.go(); /*참조변수 car는 실제로는 자손타입인 Amb타입의 인스턴스를 참조하고 있다. 따라서 Amb의 go 메서드가 오버라이딩 된 채로 실행된다. */
        amb.go();
        new Car().go();
        // System.out.println(car.siren); 에러. 조상타입의 참조변수로 자손타입의 인스턴스를 참조하면 자손타입의 메서드를 사용할 수 없음.
        
        System.out.printf("car instanceof Car: %b\n", car instanceof Car);
        System.out.printf("car instanceof Amb: %b\n", car instanceof Amb);
//         instanceof 연산자가 true를 출력한다는 것은 참조변수를 형변환해도 상관 없다는 뜻.
    
// 질문점: 조상타입의 참조변수로 자손타입의 인스턴스를 참조하면 자손타입의 메서드를 사용할 수 없어야 하는데 오버라이딩은 왜 되는가??
// 답: 메서드의 경우는 참조변수의 타입과 관계없이 항상 "실제 인스턴스의 메서드"가 실행된다.
// cf) 반면 멤버변수의 경우에는 중복선언 시 참조변수의 타입에 따라 출력값이 달라진다.
        Car c1 = new Amb();
        System.out.println(c1.door);        
        Amb a1 = (Amb)c1;                           
        System.out.println(a1.door);
        
        a1.ambsuper();
    }
}

class Car{
    int door = 4;
    void go(){
        System.out.println("Vroom!!");
    }
}

class Amb extends Car{
    int door = 2;
    int siren = 2;
    void go(){
        System.out.println("BBi Yong");
    }
    void ambsuper(){
        System.out.printf("super.door: %d\n", super.door);
        System.out.printf("this.door: %d\n", this.door);
    }
}