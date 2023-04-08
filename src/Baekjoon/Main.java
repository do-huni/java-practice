import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    
    public static void solution() throws Exception{
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            br.close();
            MECalculator cal = new MECalculator(a, b, c, d, e, f);
            System.out.println(cal.calculate());
        } catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    class MECalculator {
        int[] arr = new int[6];
        MECalculator(int a, int b, int c, int d, int e, int f){
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;
            arr[3] = d;
            arr[4] = e;
            arr[5] = f;
            
        }
        
        public int[] calculate(){
            int x = (arr[5]/arr[4] - arr[2]/arr[1])/(-arr[0]/arr[1] + arr[3]/arr[4]);
            int y = (arr[2] -arr[9] * x)/arr[1];
            int[] answer = {x, y};
            return answer;
        }
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}