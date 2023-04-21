import java.util.*;

class HashSetEx{
    public static void main(String[] args){
        //HashSet은 중복 허용하지 않는 set의 특성을 구현한 대표적 컬렉션
        //HashSet에 add를 하했을 때 중복요소를 추가하려하면 false를 반환. 이를 이용해서 컬렉션 내 중복 요소 제거 가능
        
        Object[] objArr = {"1","1.0", new Integer(1), new Float(1), new Double(1), "2", "2", "3", "3", "4"};
        Set set = new HashSet();
        for(int i=0; i<objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println(set); //중복값처럼 출력되는 것은 서로 다른 객체이기 때문. (자료형 다름))
        
        
    }
}