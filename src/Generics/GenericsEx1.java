import java.util.ArrayList;
class GenericsEx1{
    public static void main(String[] args){
        
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        
        System.out.println(fruitBox);
        
//        FruitOnlyBox<Toy> test = new FruitOnlyBox<Toy>(); => error
        FruitOnlyBox<Fruit> test = new FruitOnlyBox<Fruit>();
        test.add(new Apple());
        test.add(new Grape());
        System.out.println(test.get(1).getName());
    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}

class Fruit { String getName() { return "Fruit"; }}
class Apple extends Fruit { String getName() { return "Apple"; }}
class Grape extends Fruit { String getName() { return "Grape"; }}
class Toy { String getName() { return "Toy"; }}

class FruitOnlyBox<T extends Fruit> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }        
}