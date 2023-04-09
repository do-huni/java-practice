import java.math.BigInteger;
import java.math.BigDecimal;

class BigNumbers{
    public static void main(String[] args) throws Exception{ //main 함수에 throws Exception => 예외 catch JVM에게 떠넘기기
        for (int i = 1; i < 100; i++){
            System.out.printf("%d! = %s\n", i, calculateFacotrial(i));
            Thread.sleep(5); //0.005초 지연
        }
        System.out.println("=====================================================");
        
        
    }
    
    static String calculateFacotrial(int n){
        return factorial(BigInteger.valueOf(n)).toString(); //BigInteger.valueOf(n)으로 int를 형변환 해준다.
    }
    
    static BigInteger factorial(BigInteger n){
        if (n.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}