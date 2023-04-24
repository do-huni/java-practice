import java.util.*;

class HashMapEx3{
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.addGroup("친구");
        pb.addPhoneNumber("친구", "손지호", "010-1111-2222");
        pb.addPhoneNumber("친구", "이정훈", "010-2222-3333");
        pb.getGroupTelList("친구");
    }

}
class PhoneBook{
    private HashMap tels = new HashMap();
    
    public void addGroup(String groupName){
        tels.put(groupName, new HashMap());
    }
    
    public void addPhoneNumber(String groupName, String name, String tel){
        if (tels.containsKey(groupName)){
            HashMap groupTelList = (HashMap)this.tels.get(groupName);
            groupTelList.put(tel, name);
        } else{
            System.out.println("존재하지 않는 그룹입니다.");
        }
    }
    
    public void getGroupTelList(String groupName){
        if(tels.containsKey(groupName)){
            HashMap groupTelList = (HashMap)this.tels.get(groupName);
            Iterator it = groupTelList.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry subE = (Map.Entry)it.next();
                System.out.println(subE.getKey());            
                System.out.println(subE.getValue());
            }
        } else{
            System.out.println("존재하지 않는 그룹입니다.");
        }
    }
}