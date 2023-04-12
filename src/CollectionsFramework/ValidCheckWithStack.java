import java.util.*;

class ValidCheckWithStack{
    public static void main(String[] args){
        Checker ch = new Checker();
        ch.input();
    }
}

class Checker{
    Stack st = new Stack();
    Scanner sc = new Scanner(System.in);
    
    void input(){
        String input = sc.nextLine();
        for (int i = 0; i<input.length(); i++){
            if (input.charAt(i) == '('){
                st.push('(');
            }
            try {
                if(input.charAt(i) == ')'){
                    st.pop();
                }
            } catch (EmptyStackException e){
                    e.printStackTrace();
                    System.out.println("유효하지 않은 입력입니다.");
            }
        }
    }
}