class logicalOperator{
    public static void main(String[] args){
        // || OR
        // && AND
        
        //문자 대/소문자인지 확인
        char a = 'A';
        System.out.printf("%c는 소문자? %b%n", a, ('a'<= a && a <= 'z'));
        System.out.printf("%c는 대문자? %b%n", a, ('A'<= a && a <= 'Z'));
        
    }
}