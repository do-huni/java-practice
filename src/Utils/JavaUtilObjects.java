import java.util.*;
import static java.util.Objects.*;

class JavaUtilObjects{
    public static void main(String[] args){
        String[][] str2D = new String[][]{{"abc", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][] {{"abc", "bbb"}, {"AAA", "BBB"}};
        
        System.out.println(Objects.deepEquals(str2D, str2D2));
    }
}    