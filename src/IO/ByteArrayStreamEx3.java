import java.io.*;
import java.util.*;

class ByteArrayStreamEx3{
    public static void main(String[] args){
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];
        
        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        
        System.out.println("Input Source: " + Arrays.toString(inSrc));
        
        try{
            while(input.available() > 0 ) {// available-> 크기 반환
                // [잘못된 코드]
                // input.read(temp);
                // output.write(temp);
                // System.out.println("temp: " + Arrays.toString(temp));
                
                // outSrc = output.toByteArray();
                // System.out.println("Output Source: " + Arrays.toString(outSrc));
                
                /*
                   [console]
                   
                Input Source: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
                temp: [0, 1, 2, 3]
                Output Source: [0, 1, 2, 3]
                temp: [4, 5, 6, 7]
                Output Source: [0, 1, 2, 3, 4, 5, 6, 7]
                temp: [8, 9, 6, 7]
                Output Source: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 7]                
                */
                    
                    
                // [수정한 코드]    
                int len = input.read(temp);    //read는 리턴값으로 데이터의 사이즈를 반환함
                output.write(temp, 0, len);                   
            }
        }
        catch(IOException e) {}    
        
        /*
        마지막 temp는 {4, 5, 6, 7}.write({8,9})
        => {8,9,6,7}이 된다. why? 효율성을 위해 byte[] 값을 다 비우고 새로 쓰는게 아니라 그냥 덮어쓰기 때문
        이를 해결하려면 output.write(byte[] b, int off, int len) method를 써야함
        int len = input.read(temp)    //read는 리턴값으로 데이터의 사이즈를 반환함
        output.write(temp, 0, len);   
        */
    }
}