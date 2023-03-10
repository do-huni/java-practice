class logicalOperator{
    public static void main(String[] args){
        // || OR
        // && AND
        
        //문자 대/소문자인지 확인
        char a = 'A';
        System.out.printf("%c는 소문자? %b%n", a, ('a'<= a && a <= 'z'));
        System.out.printf("%c는 대문자? %b%n", a, ('A'<= a && a <= 'Z'));
        //위의 연산이 가능한 이유: a~z A~Z 0~9의 유니코드 값이 붙어있기 때문.
        
        //short circuit evaluation
        /*
        OR 연산은 하나만 true여도 true 반환하기에 좌측 피연산자가 true이면 연산을 종료함.
        AND 연산도 비슷한 맥락으로 좌측 피연산자가 false이면 연산을 종료함.
        이를 활용해 true(OR) 혹은 false(AND)가 나올 확률이 높은 피연산자를 좌측에 두면 계산량이 줄어듦.
        */
        
        //[논리 부정 연산자] ! 파이썬과 동,
        
        //비트 연산자
        // | : OR GATE
        // & : AND GATE
        // ^ : XOR GATE
        
        //toBinaryString() : 2진수로 변환하는 메서드
        int x = 0xAB, y = 0xF;
        System.out.printf("x | y = %s%n", Integer.toBinaryString(x | y));
        
        //비트 전환 연산자 ~: 0<->1
        byte p = 10;
        System.out.println(~p); // -11
        
        //쉬프트 연산자 << >>
        //왼쪽 혹은 오른쪽으로 비트를 밀며 벗어난 값은 버리고 빈자리는 0으로 채워진다.
        //음수의 경우 부호 유지를 위해 빈자리를 1로 채운다.
        System.out.printf("%d %d %d\n", 8>>0, 8>>1, 8>>2); //x/2^n
        System.out.printf("%d %d %d\n", 8<<0, 8<<1, 8<<2); //x*2^n
    }
}