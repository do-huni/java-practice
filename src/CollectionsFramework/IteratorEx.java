import java.util.*;

class IteratorEx{
    public static void main(String[] args){
        /*참조변수를 Collecton으로 선언 시 다른 자료형으로 형변환 할 경우 생성부분만 고쳐주면 된다.
        단, 이후의 코드에서 ArrayList에만 존재하는 기능을 사용하면 안된다.*/
        Collection c = new ArrayList();
        c.add('1');
        c.add('2');        
        c.add('3');
        Iterator it = c.iterator();
        //listIterator() 메서드는 ArrayList class에만 있기 때문에 Collection으로 선언된 참조변수를 ArrayList로 형변환 해준다.
        ListIterator liit = ((ArrayList)c).listIterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
            liit.next();
        }
        while(liit.hasPrevious()){
            System.out.println(liit.previous());
        }
    }
}