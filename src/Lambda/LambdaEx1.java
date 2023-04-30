class LambdaEx1{
    public static void main(String[] args){

        MyFunction1 f = (int a, int b) -> a > b ? a : b;
        System.out.println(f.max(10,20));
        
        MyVoid v1 = () -> System.out.println("f1.run()");
        
        MyVoid v2 = new MyVoid(){
            public void run(){
                System.out.println("f2.run()");
            }
        };
        
        MyVoid v3 = getMyVoid();
        
        v1.run();
        v2.run();
        v3.run();
        
        execute(v1);
        execute(()->System.out.println("람다식"));


    }
    
    
    static void execute(MyVoid v){
        v.run();
    }

    static MyVoid getMyVoid(){
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

