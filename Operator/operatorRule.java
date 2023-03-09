class operatorRule{
    public static void main(String[] args){
        /*
        연산자의 우선순위
        1. 산술 > 비교 > 논리 > 대입
        2. 단항 > 이항 > 삼항
        3. 단항과 이항 연산자의 연산 반향은 right->left
        */
        
        //3에 대한 부가 설명 코드: 변수 대입 연산 처리 절차
        int x, y;
        x = y = 3; //x = 3, y = 3
        /*
        대입 연산자는 우측부터 연산이 수행되기에 y가 3으로 초기화되고,
        x가 3으로 초기화된 y에게 값을 대입받아 3이 된다.
        */
        
        byte a = 1;
        byte b = 2;
        //byte c = a + b => error
        byte c = (byte)(a + b); // 단항연산자인 형변환연산자는 우선순위가 산술연산자인 덧셈연산자보다 높기에 덧셈연산을 괄호로 묶어야 byte로 변환이 된다.
        /*
        byte short는 산술 연산 시 int로 산술변환 된다.
        */
    }
}