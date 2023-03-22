class conditionalStatement{
    public static void main(String[] args){
        // if, switch
        
        //if문: js와 동일.
        
        //블럭 생략
        if(true) System.out.println("hello");
        
        if(true)
            System.out.println("hello");
        
        /*switch문의 제약조건
            1. switch문의 조건식 결과는 정수 또는 문자열이여야 한다.
            2. case문의 값은 정수 상수(including char)/문자열만 가능하며 중복되지 않아야 한다.
        */
        int level = 2;
        final int CONST_VAR = 10;
        switch (10){
            case 2:
                System.out.println("hello2");
                break;
            case CONST_VAR:
                System.out.println("hello10");
                break;
            default:
                System.out.println("helloDEF");
            
        }
    }
}