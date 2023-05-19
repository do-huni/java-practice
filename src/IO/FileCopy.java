import java.util.*;
import java.io.*;

class FileCopy{
    public static void main(String args[]){
        try{
            FileInputStream fis = new FileInputStream("./FileEx.txt");
            FileOutputStream fos = new FileOutputStream("./FileCopyEx.txt");
            
            int data = 0;
            while((data = fis.read()) != -1) {
                fos.write(data);
            }
            fis.close();
            fos.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
}