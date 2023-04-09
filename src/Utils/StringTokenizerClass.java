import java.util.StringTokenizer;
class StringTokenizerClass{
    public static void main(String[] args){
        String expression = "안녕+나는/도사무엘이야-ㅎㅎ";
        String delim = "+/-";
        StringTokenizer st = new StringTokenizer(expression, delim);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}