class unaryOperator{
    public static void main(String[] args){
        int i = 5, j = 0;
        j = i++; //C에 있는 증감연산자가 Java에도 존재
        System.out.println(j); //후위연산 -> 값이 참조 된 후 연산 수행
        
        i = 5;
        
        j = ++i; //전위연산 -> 값이 참조되기 이전에 연산 수행
        System.out.println(j);
        int x= 1;
        x = x++ - ++x;
        
        //+, - => 단항연산자


        System.out.println(x);
    }
}