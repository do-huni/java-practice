import java.util.*;

class HashMapEx{
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        
        Scanner s = new Scanner(System.in);
        
        while(true){            
            System.out.println("\nID와 Password를 입력해주세요.");
            System.out.print("id: ");
            String id = s.nextLine().trim();
            System.out.print("pw: ");
            String pw = s.nextLine().trim();
            if (map.containsKey(id)){
                if(map.get(id).equals(pw)){
                    System.out.println("로그인 되었습니다.");
                    break;
                } else{
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else{
                System.out.println("아이디가 존재하지 않습니다.");
            }
            
        }
    }
}