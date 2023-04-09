import java.util.Scanner;

class ScannerClass{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] argArr = null;
        
        while(true){
            String prompt = ">>";
            System.out.print(prompt);
            
            String input = s.nextLine();
            input = input.trim(); //공백제거
            argArr = input.split(" +");//split 메서드에 정규식 입력가능.(하나 이상의 공백))
            
            String command = argArr[0].trim();
            if("".equals(command))
                continue;
            
            command = command.toLowerCase();
            
            if (command.equals("q")){
                System.exit(0);
            } else{
                for (int i = 0; i<argArr.length; i++){
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}