class varTypes{
    public static void main(String[] args){
        //변수나 상수는 값을 저장할 수 있는 "공간"!! 값 그 자체가 아닌 공간을 뜻한다.
        System.out.println("기본 자료형 변수는 c언어와 동일");
        byte a = 127;
        System.out.println("byte 정수형 자료형의 최대값: '+ a +'[1byte = 8bit = 2^8 = 256]");
        char b = 'A';
        System.out.println("문자형 자료형 변수 char. 2byte(16bit) 크기. 글자 하나 저장 ex: " + b);
        boolean c = true;
        System.out.println("boolean: " + c + " 정수형 byte[1byte]/short[2byte]/int[4byte]/long[8byte]" + " 실수형 float[4byte]/double[8byte]");
        
        final int CONSTANT_NUMBER = 30; //상수는 정의상 공간을 의미하기에 30처럼 값 그 자체에 해당하는 것을 리터럴이라고 부른다.
        //상수 자료형은 선언과 동시에 초기화 되어야함. 변경 불가능하며 변수명은 모두 대문자인 snake_case로 작성하는 것이 관례
        
        
        //중요!! 리터럴의 타입
        //리터럴에도 타입이 있다. 특정 타입 변수에는 동일한 타입 리터럴만 저장 가능하다.
        //float pi = 3.14; <= 오류. 소수 리터럴의 기본 타입은 double
        float pi = 3.14f;
        double e = 3.14e4; //e4 = 10^4
        double e2 = 314e-3;//e-3 = (10^-1)^3
        System.out.println(e + " and " + e2);
        
        //문자열 리터럴
        String str = "안녕";
        
        String obj = new String("JavaYEAH"); //원래 String은 class로 객체(참조형 변수)를 생성해야함
        
        System.out.println(str + "\n" + obj);
    }
}