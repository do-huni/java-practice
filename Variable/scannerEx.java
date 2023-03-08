import java.util.*;

class scannerEx{
    public static void main(String[] args){
        Scanner scanVar = new Scanner (System.in);
        
        System.out.print("두자리 정수를 하나 입력해주세요. >");
        String input = scanVar.nextLine();
        int num = Integer.parseInt(input);
        
        System.out.printf("입력내용: %d\n",num);
    }
}