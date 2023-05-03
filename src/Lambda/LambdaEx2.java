class LambdaEx2{
    public static void main(String[] args){
        ((MyFunction)(()->{System.out.println("안녕?");})).myMethod(); //이게되네? 굳
        
        
        
        
    }
}

@FunctionalInterface
interface MyFunction{
    public abstract void myMethod();
}