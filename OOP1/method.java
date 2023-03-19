class method{
    public static void main(String[] args){
        
        MyMath math = new MyMath();
        System.out.println(math.add(3,6));
        
        math.printRaw(math.abs(-10));
        math.printRaw(math.diff(5,20));
        math.printRaw(math.divide(3,0));
    }
}

class MyMath{
    int add (int x, int y) {
    int result = x + y;
    return result;
}
    void printRaw(double x){
        System.out.println(x);
        //반환타입이 void이면 return;을 자동으로 붙여준다.
    }
    int diff(int x, int y){
        int result = abs(x-y);
        return result;
    }
    int abs(int x){
        return (x > 0) ? x : -x;
    }
    float divide(int x, int y){
        //validation check
        if (y == 0) {
            return 0;
        }
        return x / (float) y;
    }
}