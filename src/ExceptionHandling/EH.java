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
        System.out.println("======================================");
        (new IntentionedException()).start();
        System.out.println("======================================");
        ExceptionDeclaration ed1 = new ExceptionDeclaration();
        try{
        ed1.callThrowException();
        } catch(Exception e){
            System.out.println("예외처리함");
        }
        
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

class IntentionedException{
    void start(){
        try{
            Exception e = new Exception("고의로 발생 시켰음");
            throw e;
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("aptjem가 종료됨.");
    }
}

class ExceptionDeclaration{
    void throwException()
        throws Exception{
        System.out.println("throwException 메서드가 시작됨.");
        throw new Exception();
        //System.out.println("throwException 메서드가 종료됨.");
        //=> unreachable statement. 오류남
    }
    void callThrowException()
        throws Exception{
        /* catch 안해주면 오류남,
        정확한 원리는 throws를 통해 메서드에 예외를 선언해두면 메서드를 호출한 메서드에게 예외를 전달하는 것.
        따라서 throwException에서 선언된 예외는 그것 안 혹은 callThrowException 혹은 main 메서드에서 처리되어야 함. */
        this.throwException();
    }
}