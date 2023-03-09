class arithmeticOperator{
    public static void main(String[] args){
        int a = 10;
        int b = 4;
        
        System.out.printf("%d / %d = %d%n",a, b, a / b);
        //int 끼리의 연산의 값은 int. 따라 소수점 이하 버림.
        
        char c = 'D';
        int i = c+ 32;
        //char도 사칙연산 가능. 유니코드로 바뀌어 사칙연산 수행.
        System.out.println(i);
        System.out.println((char)i); //유니코드 상 소문자가 대문자보다 32 더 많다.
        
        //나머지 연산자
        System.out.printf("%d %% %d = %d", a, b, a % b);

    }
}