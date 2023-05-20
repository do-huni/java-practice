import java.io.*;

class StandardIOEx1{
    public static void main(String[] args) throws Exception{
        //setOut, setErr, setIn = 표준입출력의 대상 변경
        PrintStream ps = new PrintStream(new FileOutputStream("stio.txt"));
        System.setOut(ps);
        System.out.println("test!!");
    }
}