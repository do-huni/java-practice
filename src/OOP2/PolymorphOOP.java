import java.util.*;

public class PolymorphOOP{
    public static void main(String[] args){
        TV tv = new TV();
        
        Buyer Kim = new Buyer(100);
        Kim.getMoney();
        System.out.printf("tv의 가격은 %d입니다.\n",tv.getPrice());
        Kim.buy(tv);        
        Kim.setMoney(11000);
        Kim.getMoney();
        Kim.buy(tv);
        Kim.getMoney();
        
        Computer CPU = new Computer(5000);
        Kim.buy(CPU);
        Kim.getMoney();
        
        Kim.summary();
    }
}

class Product{
    //멤버변수
    private int price;
    
    //생성자
    Product()                 {this(1000);}
    Product(int price)        {this.price = price;}
    
    //메서드
    void setPrice(int price){
        this.price = price;
    }
    int getPrice(){
        return this.price;
    }
}

class TV extends Product{
    TV()            {super();}
    
    TV(int price)   {super(price);}
}

class Computer extends Product{
    Computer()          {super();}
    Computer(int price) {super(price);}
}

class Buyer{
    //멤버변수
    private int money;
    private Vector items = new Vector();
    
    
    //생성자
    Buyer()                 {this.money = 20000;}
    Buyer(int money)        {this.money = money; }
    
    //메서드
    //물품 구매 메서드
    void buy(Product P){
        if (this.money < P.getPrice()){
            System.out.println("현재 예산으로 구매할 수 없습니다.");
        } else{
            this.money -= P.getPrice();
            System.out.println(P + "을/를 " +P.getPrice() +"원에 구입하셨습니다.");
            items.add(P);
        }
    }
    
    //예산 설정 메서드
    void setMoney(int money){
        this.money = money;
    }
    
    //현재 예산 출력 메서드
    int getMoney(){
        System.out.printf("현재 예산은 %d입니다.\n",this.money);
        return this.money;
    }
    
    //구입 물품 리스트 메서드
    void summary(){
        for (int i = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
    }
    
}