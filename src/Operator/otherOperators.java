class otherOperators{
    public static void main(String[] args){
        int ifTrue = 1;
        int ifFalse = 2;
        
        int result = (true) ? ifTrue : ifFalse;
        System.out.println(result);
        
        result = (false) ? ifTrue: ifFalse;
        System.out.println(result);
        
        // op=, += *= 복합 대입 연산자
    }
}