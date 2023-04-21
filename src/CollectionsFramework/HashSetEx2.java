import java.util.*;

class HashSetEx2{
    public static void main(String[] args){
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        
        HashSet setUNION = new HashSet();
        HashSet setINTERSECTION = new HashSet();
        HashSet setDIFFERENCE = new HashSet();
        
        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        
        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        
        System.out.println("setA: " + setA + "\nsetB: " + setB);
        
        Iterator it = setB.iterator();
        
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp)){
                setINTERSECTION.add(tmp);
            }
        } //end of while
        
        it = setA.iterator();
        while(it.hasNext()){
            Object tmp = it.next();
            if(!setB.contains(tmp)){
                setDIFFERENCE.add(tmp);
            }
        } //end of while
        
        it = setA.iterator();
        while(it.hasNext()){
            Object tmp = it.next();
            setUNION.add(tmp);
        } //end of while
        
        it = setB.iterator();
        while(it.hasNext()){
            setUNION.add(it.next());
        }
        System.out.println("setUNION: " + setUNION + "\nsetINTERSECTION: " + setINTERSECTION + "\nsetDIFFERENCE: " + setDIFFERENCE);
    }
}