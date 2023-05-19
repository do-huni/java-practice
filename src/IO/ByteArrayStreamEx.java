import java.io.*;
import java.util.*;

class ByteArrayStreamEx{
    public static void main(String[] args){
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();
        
        int data = 0;
        
        while( (data = input.read() ) != -1){ //대입연산이 완료된 data의 값이 -1이 아닌지 비교한다
            output.write(data); //1바이트씩 읽어서 출력소스에 쓴다
        }
        
        outSrc = output.toByteArray();
        System.out.println("input source: " + Arrays.toString(inSrc));
        System.out.println("output source: " + Arrays.toString(outSrc));
    }
}