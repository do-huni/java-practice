import java.util.*;

class Initialization{
    public static void main(String[] args){
        InitTest t1 = new InitTest();
        System.out.printf("인스턴스변수: %d%n클래스변수: %d%n", t1.z1, t1.z2);
        //멤버변수는 선언만 하고 초기화하지 않아도 자동으로 기본값이 할당되어 사용할 수 있다.
        System.out.printf("지역변수: %d%n",t1.method1());
        
        int q = 10, w = 10; //같은 타입의 변수는 콤마를 통해 함께 선언/초기화 가능하다.
        
        System.out.println(Arrays.toString(InitBlock.arr));
        
        InitBlock it1 = new InitBlock();
        System.out.println(it1.serial_num);
        
        InitBlock it2 = new InitBlock();
        System.out.println(it2.serial_num);        
    }
}

class InitTest{
    int x;
    static int y;
    int z1 = x;
    int z2 = y;
    
    int method1(){
        int i;
        //int j = i; 에러. 지역변수는 초기화까지 해주어야 사용가능
        i = 10;
        int j = i;
        return j;
    }
}

class InitBlock{
    
    static int[] arr = new int[10];
    int serial_num;
    //클래스 초기화 블럭
    static{
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10);
        }
    }
    //인스턴스 초기화 블럭
    {    
        int randomI = (int)(Math.random()*10);
        serial_num = arr[randomI];
    }
}