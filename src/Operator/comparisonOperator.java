class comparisonOperator{
    public static void main(String[] args){
        //비교 연산자
        
        //[대소비교 연산자] >, <, >= , <= 파이썬과 동.
        //[등가비교 연산자] ==, != 파이썬과 동.
        
        System.out.printf("10 == 10.0f : %b%n", 10 == 10.0f); //비교연산자도 이항연산자이므로 타입을 동일하게 맞춘 후 비교 수행
        System.out.printf("0.1f == 0.1 %b%n", 0.1f == 0.1);
        System.out.printf("0.1f == (float)((double)0.1) %b%n", 0.1f == (float)((double)0.1));
        //실수형의 오차값때문에 double과 float 값 비교 불가능. 해결법: double 값을 float로 변환
        
        //문자열의 비교
        //문자열 비교 시 == 대신 equals() 메서드를 사용해야함
        
        String str = new String("abc");
        System.out.printf("equals: %b, ==: %b%n", str.equals("abc"), str == "abc");
        //==가 false인 이유는 다른 객체이기 때문. equals는 객체가 달라도 내용이 같으면 true를 반환함.
    }
}