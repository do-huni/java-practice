class Inclusion{
    public static void main(String[] args){
        //포함관계
        Car car = new Car();
        System.out.println(car.e.type);
        for (int i = 0; i < car.d.length; i++){
            car.d[i].material = "wood";
        }
        System.out.println(car.d[2].material);
    }
}
class Car{
    //인스턴스 변수
    Engine e = new Engine();
    Door[] d = new Door[4];
    //인스턴스 초기화 블럭
    {for (int i = 0; i < 4; i++) 
        d[i] = new Door();
    }
}

class Engine{
    //생성자
    public Engine(){
        this.type = "auto";
    }
    //인스턴스 변수
    String type;
    //메서드
    void typeChange(){
        if (this.type == "auto"){
            this.type = "manual";
        } else{
            this.type = "auto";
        }
    }
}

class Door{
    //인스턴스 변수
    String material;
    //생성자
    public Door() {}
}