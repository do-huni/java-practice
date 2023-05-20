import java.io.*;

class RandomAccessFileEx{
    public static void main(String[] args){
        int[] score = {1, 100, 90, 90,
                      2, 70, 90, 100,
                      3, 100, 100, 100,
                      4, 70, 60, 80,
                      5, 70, 90, 100};
        
        try{
            RandomAccessFile raf = new RandomAccessFile("randacc.dat", "rw");
            for(int i = 0; i<score.length; i++){
                raf.writeInt(score[i]);
            }
            System.out.println("포인터: " + raf.getFilePointer());
            raf.seek(0);
            while(true){                
                System.out.println(raf.readInt());
                System.out.println("포인터: " + raf.getFilePointer());                
            }
        } catch(Exception e) {}
    }
}