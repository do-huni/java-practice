import java.util.*;
import java.io.*;

class DataOutputStreamEx2{
    static void print4byte(DataInputStream dis) throws IOException{
        System.out.print("[ ");
        for(int i =0;i<4;i++){
            System.out.print(dis.readByte() + " ");                
        }            
        System.out.print("]\n");
    }
    public static void main(String[] args){
        ByteArrayOutputStream bos = null;
        DataOutputStream dos = null;
        
        byte[] result = null;
        
        try{
            bos = new ByteArrayOutputStream();
            dos = new DataOutputStream(bos);
            dos.writeInt(10);
            dos.writeFloat(20.0f);
            dos.writeBoolean(true);
            
            result = bos.toByteArray();
            String[] hex = new String[result.length];
            
            for(int i = 0; i<result.length; i++){
                if(result[i]<0){
                    hex[i] = String.format("%02x", result[i] + 256); //이걸 하는 이유 -> byte자료형은 부호때문에 제일 앞의 1비트를 씀. -128~127 => 0~255로 해주기 위함 
                } else{
                    hex[i] = String.format("%02x", result[i]);
                }                
            }
            
            System.out.println("10진수: " + Arrays.toString(result));
            System.out.println("16진수: " + Arrays.toString(hex));
            
            dos.close();
            
            FileInputStream fis = new FileInputStream("sample.dat");
            FileInputStream fis2 = new FileInputStream("sample.dat");            
            DataInputStream dis = new DataInputStream(fis);
            DataInputStream dis2 = new DataInputStream(fis2);
            
            
            System.out.println(dis.markSupported()); //까비
            System.out.println(dis.readInt());
            print4byte(dis2);
            System.out.println(dis.readFloat());
            print4byte(dis2);
            System.out.println(dis.readBoolean());
            System.out.println(dis2.readByte());
        } catch(IOException e){}
        
    }
}