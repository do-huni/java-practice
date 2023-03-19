class staticMethod{
    public static void main(String args[]){
        /*
        static method(클래스 메서드)
        인스턴스와 관계 없는(인스턴스 변수나 인스턴스 메서드를 사용하지 않는) 메서드들 주로 클래스 메서드로 정의한다.
        메서드 앞에 static을 붙인다.
        cf) Math 클래스의 모든 메서드는 클래스 메서드이다.
        
        instance method(인스턴스 메서드)
        인스턴스 변수와 관련된 작업을 하는 메서드. 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드.
        */
        
        MyMath mat = new MyMath();
        mat.a = 1L;
        mat.b = 2L;
        double[] arr1 = {mat.add(), mat.multiply(), mat.subtract(), mat.divide()};
        for (double i : arr1){
            System.out.println(i);
        }
        MyMath clmat = new MyMath();
        long q = 8;
        long w = 4;
        double[] arr2 = {clmat.add(q,w), clmat.multiply(q,w), clmat.subtract(q,w), clmat.divide(q,w)};
        for (double i : arr2){
            System.out.println(i);
        }
    }
}

class MyMath{
    //iv(instance value)
    long a, b;
        
    //methods
    
    //instance method. 인스턴스변수를 사용함으로 매개변수가 필요없음.
    long add() { return a + b;}
    long multiply() { return a * b;}
    long subtract() { return a - b;}
    double divide() { return a / b;}
    
    //class method. 인스턴스변수를 활용하지 않음. 매개변수를 받아야함.
    static long add(long a, long b) {return a + b;}
    static long multiply(long a, long b) {return a * b;}
    static long subtract(long a, long b) {return a - b;}
    static double divide(long a, long b) {return a / b;}
}