import java.util.*;
enum Transportation{
    
    BUS(1200)  {    int fare(int distance) {return BASIC_FARE;}    },
    TRAIN(3000) {    int fare(int distance) {return BASIC_FARE + distance*100;}    },
    SHIP(2000) {    int fare(int distance) {return BASIC_FARE + distance*60;}    },
    AIRPLANE(20000) {    int fare(int distance) {return BASIC_FARE + distance*50;}    };
    
    
    //===============================================
    //열거형 내부 값 선언
    protected final int BASIC_FARE;
    
    //생성자
    Transportation(int basicFare){
        this.BASIC_FARE = basicFare;
    }
    
    public int getBasicFare() { return this.BASIC_FARE; } //그냥 메서드
    abstract int fare(int distance); //추상메서드
}

enum TEST{
    T1(10,"T1"), T2(20, "T2");
    
    //=======================
    protected final int val;
    protected final String name;
    TEST(int val, String name)    {
        this.val = val;
        this.name = name;
    }
    
    ArrayList getValues(){
        ArrayList output = new ArrayList();
        output.add((Integer)val);
        output.add(name);
        return output;
        
    }
    
}
class EnumEx2{
    public static void main(String[] args){
        System.out.println("bus fare = " + Transportation.BUS.fare(100));
        System.out.println("train fare = " + Transportation.TRAIN.fare(100));
        System.out.println("ship fare = " + Transportation.SHIP.fare(100));
        System.out.println("airplane fare = " + Transportation.AIRPLANE.fare(100));
        
        System.out.println(TEST.T1);
        System.out.println(TEST.T1.values());
        System.out.println(TEST.valueOf("T2"));
        Iterator it1 = TEST.T1.getValues().iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}