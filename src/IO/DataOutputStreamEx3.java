import java.io.*;

class DataOutputStreamEx3{
    public static void main(String[] args){
        int[] score = {100,85,95,90,65,83};
        
        try{
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"));
            for(int i : score){
                dos.writeInt(i);
            }
            dos.close();
        } catch(IOException e){}
        
        int sum = 0;
        try(FileInputStream fis = new FileInputStream("score.dat");
            DataInputStream dis = new DataInputStream(fis)) {
            while(true){
                int tempScore = dis.readInt();
                System.out.println(tempScore);
                sum += tempScore;
            }
        } catch(EOFException e) {
            System.out.println("총합은 " + sum);
        } catch(IOException ie) {
            
        }
    }
}