import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) throws Exception {
        try{
            
            boolean test = false;
            InputReader io = (test) ? new testInputReader() : new submitInputReader();
            
// ========================================================Write Here========================================================            
            int N = Integer.valueOf((io.readLine()));
            String[] strInputArr1 = io.readLine().split(" ");
            String[] strInputArr2 = io.readLine().split(" ");            
            ArrayList<Integer> distanceArr = new ArrayList<Integer>();
            for(String i : strInputArr1){
                distanceArr.add(Integer.valueOf(i));                    
            }
            ArrayList<Integer> priceArr = new ArrayList<Integer>();
            for(String i : strInputArr2){
                priceArr.add(Integer.valueOf(i));                    
            }
            HashMap<Integer,Integer> map = new HashMap();
            int distance = 0;
            for(int i = 0; i < N; i++){
                if(i!=0){
                    distance += distanceArr.get(i-1);
                }
                map.put(distance, priceArr.get(i));
            }            
            final int MAXOIL = distanceArr.stream().mapToInt(Integer::valueOf).sum();
            int totalOil = 0;            
            int payment = 0;
            while(totalOil<MAXOIL){
                int minPrice = Integer.MAX_VALUE;
                int rechable = Integer.MAX_VALUE;
                for(Integer i : map.keySet()){
                    if(totalOil >= i){
                        minPrice = Math.min(minPrice, map.get(i));
                    } else{
                        rechable = Math.min(rechable, i);
                    }
                }                
                int nextDistance = rechable - totalOil;

                totalOil += nextDistance;
                payment += minPrice * nextDistance;
            }
            System.out.println(payment);
            

            
            
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
