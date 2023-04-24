import java.util.*;

class GenericsEx2{
    public static void main(String[] args){
        
        Apple app1 = new Apple();
        app1.setName("greenApple");
        app1.setVal(10);
        
        Fruit f1 = new Fruit();
        f1.setVal(20);
        
        FruitBox box1 = new FruitBox();
        box1.add(app1);
        box1.add(f1);
        
        Juice j1 = Juicer.makeJuice(box1);
        Iterator<Fruit> it1 = j1.getElements().iterator();
        while(it1.hasNext()){
            Fruit f = it1.next();
            if (f instanceof Apple){
                System.out.println(((Apple)f).getName());
            }
            System.out.println(f.getVal());
        }
        
        
    }
}

class Juicer{
    static Juice makeJuice(FruitBox<? extends Fruit> box){
        Juice output = new Juice();
        
        for(Fruit f : box.getList()){
            output.addFruit(f);
        }
        
        return output;
        
    }
}

class Juice{
    private ArrayList elements = new ArrayList();
    void addFruit(Fruit f){
        this.elements.add(f);
    }
    ArrayList getElements(){
        return this.elements;
    }
}
class FruitBox<T extends Fruit> {
    ArrayList<T> list = new ArrayList<T>();
    
    ArrayList<T> getList() { return list; }
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }        
}

class Fruit{
    private int val;
    
    void setVal(int val){
        this.val = val;
    }
    int getVal(){
        return this.val;
    }
    
}

class Apple extends Fruit{
    private String name;
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    
}