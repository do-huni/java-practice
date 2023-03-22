class arithmeticOperator{
    public static void main(String[] args){
        int a = 10;
        int b = 4;
        
        System.out.printf("%d / %d = %d%n",a, b, a / b);
        //int 끼리의 연산의 값은 int. 따라 소수점 이하 버림.
        
        char c = 'D';
        int i = c+ 32; // c+32는 int 리터럴(사칙연산 자동 형변환))
        //char도 사칙연산 가능. 유니코드로 바뀌어 사칙연산 수행.
        System.out.println(i);
        System.out.println((char)i); //유니코드 상 소문자가 대문자보다 32 더 많다.
        
        //자동형변환과 int간의 나눗셈을 이용한 소수점 특정 자리까지 추출
        float pi = 3.141592f; //실수 리터럴 기본값이 double이므로 접미사 f를 써야 오류가 나지 않음
        System.out.println((int)(pi*1000) / 1000f);
        
        //반올림 테크닉
        System.out.println((int)(pi*1000+1)/1000f);
        System.out.println(Math.round(pi*1000)/1000.0);
        
        //나머지 연산자
        System.out.printf("%d %% %d = %d%n", a, b, a % b); //나누는 값으로 음수를 입력해도 괜찮으나 부호는 무시됨

    }
}