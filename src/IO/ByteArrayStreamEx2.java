import java.io.*;
import java.util.*;

class ByteArrayStreamEx2{
    public static void main(String[] args){
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[10];
        
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();
        
        input.read(temp, 0, temp.length); //int read(byte[] b, int off, int len) 배열 b의 off부터 len개의 byte를 읽어서 저장한다.
        output.write(temp, 5, 5); //void write(byte[] b, int off, int len) 배열 b에 저장된 내용 중 off번째부터 len개 읽어서 출력소스에 쓴다.
        
        outSrc = output.toByteArray();
        
        System.out.println("input source: " + Arrays.toString(inSrc));
        System.out.println("temp : " + Arrays.toString(temp));
        System.out.println("output source: " + Arrays.toString(outSrc));
    }
}