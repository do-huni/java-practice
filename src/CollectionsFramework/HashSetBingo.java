import java.util.*;

class HashSetBingo{
    public static void main(String[] args){
        Set set = new HashSet();
        
        int[][] board = new int[5][5];
        for (int i = 0; set.size() <25; i++){
            set.add((int)(Math.random()*50)+1+""); //0제외 중복되지 않는 1~50사이의 25개 값을 저장
        }
        
        Iterator it = set.iterator();
        
        for(int i = 0; i<board.length; i++){
            for (int j = 0; j<board[i].length; j++){ //2차원 배열 순회
                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]); //간격 맞추기
            }
            System.out.println();
        }
    }
}