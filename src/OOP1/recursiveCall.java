class recursiveCall{
    public static void main(String[] args){
        int result = factorial(4);
        System.out.println(result);
    }
    /*static 메서드이기에 인스턴스를 생성하지 않고 호출 가능함. main 메서드와 같은 클래스에 있기 때문에 클래스 이름을 생략 가능*/
    static int factorial(int a){
        int result = 0;
        /*a 상한이 12인 이유는 13일 경우 팩토리얼 값이 int타입의 최대 저장 값을 넘기 때문*/
        if (a < 0 || a > 12){
            return -1;
        }
        if (a == 0){
            result = 1;
        } else{
            result = factorial(a-1) * a;
        }
        return result;
    }
}