import java.io.*;

class PipedReaderEx1{
    public static void main(String[] args){
        InputThread inThread = new InputThread("InputThread");
        OutputThread outThread = new OutputThread("OutputThread");
        
        inThread.connect(outThread.getOutput());
  
        inThread.start();
        outThread.start();
      /* 무슨 일이 일어났는가?
        outThread의 PipedWriter과 inThread의 PipedReader을 연결한다.
        outThread에서 run메서드가 실행되며 "hello" 스트링을 PipedWriter에 쓰고 close한다.
        inThread에서 PipedReader을 읽어오고 StringWriter에 쓴다.
       */
                
    }
}

class InputThread extends Thread{
    PipedReader input = new PipedReader();
    StringWriter sw = new StringWriter();
    
    InputThread(String name){
        super(name);
    }
    
    public void run(){
        try{
            int data = 0;
            while((data=input.read()) != -1){
                sw.write(data);
            }
            System.out.println(getName() + " received : " + sw.toString());
        } catch(IOException e){}
    }
    
    public PipedReader getInput(){
        return input;
    }
    public void connect(PipedWriter output){
        try{
            input.connect(output);
        } catch(IOException e){}
    }
}

class OutputThread extends Thread{
    PipedWriter output = new PipedWriter();
    
    OutputThread(String name){
        super(name);
    }
    
    public void run(){
        try{
            String msg = "hello";
            System.out.println(getName() + " sent : " + msg);
            output.write(msg);
            output.close();
        } catch(IOException e){}
    }
    
    public PipedWriter getOutput(){
        return output;
    }
    
    public void connect(PipedReader input){
        try{
            output.connect(input);
        } catch(IOException e){}
    }
}