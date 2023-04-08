class MathClass{
    public static void main(String[] args){
        //public static final double
        System.out.println("E: " + Math.E + "\n" + "PI: " + Math.PI);
        
        //round메서드 사용 테크닉
        
        double d1 = 90.7552;
        //반올림
        System.out.println("반올림: " + Math.round(d1));
        //자릿수 지정 반올림
        System.out.println("셋째자리 반올림: " + Math.round(d1*1000)/1000.0);
        
        //올림
        System.out.println("올림: " + Math.ceil(d1));
        
        //내림
        System.out.println("내림: " + Math.floor(d1));
        //절대값
        System.out.println("-10의 절대값: " + Math.abs(-10));
        
        //Exact 메서드
        try{
            int m1 = Math.multiplyExact(9999999, 99999);
        } catch (ArithmeticException e){
            System.out.println("연산결과가 오버플로우 시 예외발생시킴");
            
        }
        //삼각함수, 지수, 로그
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 2;
        
        //sqrt() = 루트, pow(2,3) = 2의 3제곱
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
        System.out.println("distance: " + distance);
        double sinD = distance * Math.sin(Math.PI/4); //rad = 45
        System.out.println("sin(PI/4) * distance: " + sinD);
        
        //max,min,random
        double rand1 = Math.random();
        double rand2 = Math.random();        
        System.out.println("랜덤1: " + rand1);
        System.out.println("랜덤2: " + rand2);
        double max1 = Math.max(rand1, rand2);
        double min1 = Math.min(rand1, rand2);
        System.out.println("최대값: " + max1);
        System.out.println("최소값: " + min1);                
    }
}