class printf{
    public static void main(String[] args){
        // C언어와 동일
        int age = 3;
        boolean bool = true;
        double floatingPoint = 17.25;
        String str = "hello!";
        
        System.out.printf("age: %d\n", age);
        System.out.printf("bool: %b\nfloatingPoint: %f\nString: %s", bool, floatingPoint, str);
        
    }
}