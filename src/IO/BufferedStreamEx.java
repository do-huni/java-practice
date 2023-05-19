import java.util.*;
import java.io.*;

class BufferedStreamEx{
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("./FileEx.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
            
            for (int i = '1'; i<= '9'; i++){ //char이라 가능한 반복문
                bos.write(i); //bos의 버퍼에 값이 다 차야 출력소스에 출력을 함. 크기가 5인데 입력값이 9라 덜찬 버퍼는 출력이 안됨.
            }
            /*
            i = 5 -> file = ""         buffer = [1,2,3,4,5]
            i = 6 -> file = "12345"    buffer = [6]
            i = 7 -> file = "12345"    buffer = [6,7]
            */        
            //flush를 해주면 남은 버퍼 속 값을 다 출력하는데, 보조스트림의 메서드 close에는 flush를 호출한 후 close를 하는 식으로 오버라이딩 돼있음.
            // fos.close(); 이러면 버퍼에 남은 값 출력 못하는데,
            bos.close(); //이렇게만 해도 버퍼 값 전부 출력한다.
        } catch(IOException e){}
    }
}