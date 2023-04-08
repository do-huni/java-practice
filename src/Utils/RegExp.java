import java.util.regex.*;

class RegExp{
    public static void main(String[] args){
        String[] data = {"hello", "nice", "aya"};
        String[] regex = {".*", "hel*o"};
        
        Pattern p = Pattern.compile(regex[1]);
        Matcher m = p.matcher(data[0]);
        if(m.matches()){
            System.out.println(data[0]+" matched!");
        }
    }
}