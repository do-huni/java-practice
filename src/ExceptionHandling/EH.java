class EH{
    public static void main(String[] args){
        /* 에러의 종류
        컴파일 에러: 컴파일 시 발생하는 에러
        런타임 에러: 실행 시 발생하는 에러
        논리적 에러: 실행은 되지만, 의도와 다르게 동작하는 것(창고의 재고값이 음수가 되는 것 등)
        
        에러 vs 예외
        에러: 코드에 의해 수습될 수 없는 심각한 오류
        예외: 코드에 의해 수습될 수 있는 다소 미약한 오류
        */
        
        
        /* 자바의 예외 클래스
        Object > Throwable
        Throwable > Exception
        Throwable > Error
        
        Exception 클래스들: 사용자의 실수 등 외적 요인에 의해 발생
        Exception > IOException
        Exception > ClassNotFoundException
        Exception > ...
        
        RuntimeException 클래스들: 프로그래머의 실수로 인해 발생
        Exception > RuntimeException > ...
        */
        (new TryZeroDiv()).start();
        
    }
}

class TryZeroDiv{
    int number = 100;
    int result = 0;
    
    void start(){
        for (int i = 0; i<10; i++){
            try{
                result = number/ (int)(Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException ae){
                ae.printStackTrace(); //예외 정보 출력
                System.out.println("예외 메시지 : " + ae.getMessage()); //ae에 저장된 예외메시지 리턴
                System.out.println("0");
            } catch (Exception e){ //모든 예외는 Exception class의 자손이므로, Exception을 통해 어떤 종류의 예외든 처리 가능하다.
                System.out.println("Exception occured"); 
            }
        }
    }
}