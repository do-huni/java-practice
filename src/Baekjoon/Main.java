import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        try{
            
            boolean test = false;
            InputReader io = (test) ? new testInputReader() : new submitInputReader();
            
// ========================================================Write Here========================================================            
            int T = (int)(io.readLine());
            for(int gogo = 0; i<T; i++){
                int K = (int)(io.readLine());
                ArrayList<Integer> inputs = new ArrayList<Integer>(io.readLine().split(" "));
            }
            
            
// ========================================================Write Here========================================================            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();            
        }

    }
}

// ========================================================InputReader========================================================
abstract class InputReader{

    abstract protected String readLine();
}

class testInputReader extends InputReader{
    private Scanner sc = new Scanner(System.in);
    protected String readLine(){
        return sc.nextLine();
    }
}

class submitInputReader extends InputReader {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /*private StringTokenizer st;
    {
        try{
            st = new StringTokenizer(br.readLine()); 
        } catch(Exception e) {}
    }*/
    protected String readLine(){        
        try{return br.readLine();} catch(Exception e) {} ;
        return "";
        //return st.nextToken();
    }
}
// ========================================================InputReader========================================================
