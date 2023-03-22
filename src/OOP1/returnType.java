class returnType{
    public static void main(String[] args){
        returnType r = new returnType();
        int result = r.add(3,6);
        System.out.println(result);
        
        int[] result2 = {0};
        r.add(3,6,result2);
        System.out.println(result2[0]);
    }
    /*반환값이 있는 메서드*/
    int add(int a, int b){ 
        return a + b;
    }
    /*반환값이 없는 메서드*/
    void add(int a, int b, int[] result){
        result[0] = a + b;
    }
    //같은 이름의 메서드가 2개 있는 경우 입력 파라미터를 보고 적합한 메서드를 사용(오버로딩)
}