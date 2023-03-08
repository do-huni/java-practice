class printf{
    public static void main(String[] args){
        // C언어와 동일
        int age = 3;
        boolean bool = true;
        double floatingPoint = 17.25;
        String str = "hello!\n";
        
        System.out.printf("age: %d\n", age);
        System.out.printf("bool: %b\nfloatingPoint: %f\nString: %s", bool, floatingPoint, str);
        
        String test = "공간 할당 테스트 문자열 입니다.";
        System.out.printf("[%30s]%n\n", test);
        System.out.printf("[%-30s]%n\n", test);
        System.out.printf("[%.5s]%n", test);
    }
}