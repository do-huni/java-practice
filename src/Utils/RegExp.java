import java.util.regex.*;

class RegExp{
    public static void main(String[] args){
        String[] data = {"hello", "nice", "aya"};
        String[] regex = {".*", "hel*o"};
        
        Pattern p = Pattern.compile(regex[1]);
        Matcher m = p.matcher(data[0]);
        if(m.matches()){
            System.out.println(data[0]+" matched!\n=======================");
        }
        
        Pattern p1 = Pattern.compile("(\\d{4})-(\\d{1,2})-(\\d{1,2})");
        String source = "2020-11-18 and 2024-03-29";
        Matcher m1 = p1.matcher(source);
        while(m1.find()){
            System.out.println(m1.group(1) + "\n" + m1.group(2) + "\n" + m1.group(3) + "\n=======================");        
        }
    
    }
}