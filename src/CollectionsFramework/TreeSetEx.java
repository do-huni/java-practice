import java.util.*;

class TreeSetEx{
    public static void main(String[] args){
        //Treeset: 이진 검색 트리
        //배열 리스트, 링크드 리스트에 비해 추가/삭제가 느리고 검색/정렬에 유리
        //중복값 저장 불가(set을 구현한 클래스)
        
        TreeSet treeset = new TreeSet();
        
        for (int i = 0; treeset.size() < 6; i++){
            int tmp = (int)(Math.random()*55 + 1);
            treeset.add(tmp);
        }
        System.out.println(treeset);
        
        
        //==================================================================
        
        treeset = new TreeSet();
        int[] score = {1,2,10,54,85,12,87,50,52,100,76,23,62,37};
        for(int i = 0; i<score.length; i++){
            treeset.add(score[i]);
        }
        Set headset = treeset.headSet(new Integer(50));
        Set tailset = treeset.tailSet(new Integer(50));
        
        System.out.println("headset: " + headset);
        System.out.println("tailset: " + tailset);
        
    }
}