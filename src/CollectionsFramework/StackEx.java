import java.util.*;

class StackEx{
    public static void main(String[] args){
        Program pr = new Program();
        pr.runProgram();
  
    }
}

class Program{
    

    Scanner sc = new Scanner(System.in);
    Stack backStack = new Stack();
    Stack forStack = new Stack();
    String currentPage = "NONE";
    
    void runProgram(){
        while(true){
            System.out.println("=============================================");
            System.out.printf("입력 값에 따라 다음과 같은 명령을 수행할 수 있습니다.\n입력:1 페이지 이동\n입력:2 뒤로가기\n입력:3 앞으로 가기\n입력:4 스택 초기화\n입력:q 프로그램 종료\n");
            System.out.println("=============================================");            
            System.out.printf("현재화면: %s\n", currentPage);
            System.out.print(">>");
            String input = sc.nextLine();
            if ("q".equals(input)){
                break;
            }
            if("1".equals(input)){                
                pageMove(sc.nextLine());
            }
            if("2".equals(input)){
                backward();
            }    
            if("3".equals(input)){
                forward();
            }   
            if("4".equals(input)){
                forStack.clear();
                backStack.clear();
            }               
        }        
    }

    void pageMove(String s){
        backStack.push(currentPage);        
        currentPage = s;
    }
    
    void backward(){
        if (backStack.empty()){
            System.out.println("명령을 수행할 수 없습니다. 사유: 스택이 비어있음.");
            return;
        } else{
            String TEMP = backStack.pop().toString();
            currentPage = TEMP;
            forStack.push(TEMP);            
        }
    }
    void forward(){
        if (forStack.empty()){
            System.out.println("명령을 수행할 수 없습니다. 사유: 스택이 비어있음.");
            return;
        } else{
            String TEMP = forStack.pop().toString();
            currentPage = TEMP;
            backStack.push(TEMP);            
        }

        
    }
}