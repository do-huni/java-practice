class LambdaEx1{
    public static void main(String[] args){

        MyFunction1 f = (int a, int b) -> a > b ? a : b;
        //추상인터페이스의 익명객체를 람다식으로 대체함.
        //왜 되는가? 사실은 람다식도 익명객체이기 때문.
        
        System.out.println(f.max(10,20));
        
        MyVoid v1 = () -> System.out.println("f1.run()");
        
        MyVoid v2 = new MyVoid(){
            public void run(){
                System.out.println("f2.run()");
            }
        };`
        
        MyVoid v3 = getMyVoid();
        
        v1.run();
        v2.run();
        v3.run();
        
        execute(v1);
        execute(()->System.out.println("람다식"));


    }
    
    
    static void execute(MyVoid v){ //매개변수가 람다식
        v.run();
    }

    static MyVoid getMyVoid(){ //반환타입이 람다식
        return () -> System.out.println("v3.run()");
    }
            
}

@FunctionalInterface
interface MyFunction1{
    public abstract int max(int a, int b);
}

@FunctionalInterface
interface MyVoid{
    void run();
}

