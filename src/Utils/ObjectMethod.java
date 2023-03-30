class ObjectMethod{
    public static void main(String[] args){
        //Object.equals()
        
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        
        if (v1.equals(v2)){
            System.out.println("v1 equals to v2");
        } else{
            System.out.println("v2 not equals to v2"); //정답
        }
        
        //equals() 메서드는 참조변수가 가리키는 "인스턴스"(=주소값)가 서로 같아야함.
        System.out.println(("Hello".equals("Hello")));
        //문자열 클래스는 equals 메서드로 값비교를 한다. 오버라이딩을 통해 equals를 재정의 해두었기 때문.
        
        //Object.hashCode()
        //찾고자 하는 값을 입력하면 값이 저장된 위치를 반환
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        
        //toString()
        //getClass().getName() + "@" + Integer.toHexString(hashCode());
        //클래스명 + @ + 16진수의 해시코드
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        
        //문자열 클래스는 문자열을 반환
        System.out.println("Hello".toString());
        //Date 클래스는 나짜와 시간을 문자열로 변환
        java.util.Date today = new java.util.Date();
        System.out.println(today.toString());
        
        //clone()
        Value v3 = (Value) v2.clone();
        //Object 클래스에 대한 참조변수로 클론되기에 자손클래스로 형변환을 해줘야 한다.
        //허나 공변 반환타입을 활용한 메서드를 구현한 경우 형변환이 필요 없다
        Conv c1 = new Conv();
        c1.value = 2;
        Conv c2 = c1.clone();
        System.out.println(c2.value);
        
        //shallowCopy vs deepCopy
        //clone메서드는 참조변수의 "주소값"만 복사함. 따라서 복사된 인스턴스가 참조변수에 접근하여 값을 변동하면 원본의 값도 변동됨.
        //이렇게 참조변수의 주소값만 복사하는 경우를 shallowCopy라고 함.
        //주소값이 아니라 아예 동일한 값을 지니는 새로운 인스턴스롤 생성하여 참조하게 해 복사하는 경우 deepCopy라고 부름.
        Copy origin = new Copy();
        Copy copy1 = origin.shallowCopy();
        Copy copy2 = origin.deepCopy();
        System.out.printf("copy1.v1.value: %d\n",copy1.v1.value);     
        System.out.printf("copy2.v1.value: %d\n",copy2.v1.value);        
        System.out.printf("origin.v1.value: %d\n",origin.v1.value);        
        copy1.v1.value = 2;
        System.out.println("[초기화] copy1.v1.value = 2");
        System.out.printf("*copy1.v1.value: %d\n",copy1.v1.value);     
        System.out.printf("copy2.v1.value: %d\n",copy2.v1.value);        
        System.out.printf("*origin.v1.value: %d\n",origin.v1.value);
        copy2.v1.value = 555;
        System.out.println("[초기화] copy2.v1.value = 555");        
        System.out.printf("copy1.v1.value: %d\n",copy1.v1.value);     
        System.out.printf("*copy2.v1.value: %d\n",copy2.v1.value);        
        System.out.printf("origin.v1.value: %d\n",origin.v1.value);        
    }
}

class Copy implements Cloneable{
    Value v1 = new Value(20);
    
    public Copy shallowCopy(){
        Object obj = null;
        try{
            obj = super.clone();
        } catch(Exception e){}
        return (Copy) obj;
    }
    
    public Copy deepCopy(){
        Object obj = null;
        try{
            obj = super.clone();
        } catch(Exception e){}
        Copy cc1 = (Copy) obj;
        cc1.v1 = new Value(this.v1.value);
        return cc1;
    }
}
class Value implements Cloneable{ //clone을 쓰기 위한 조건 1) Cloneable 인터페이스 구현
    int value;
    Value (int value){
        this.value = value;
    }
    public Object clone(){ //clone을 쓰기 위한 조건 2) clone메서드의 접근자를 public으로 변환.
        Object obj = null;
        try{ //clone을 쓰기 위한 조건 3) CloneNotSupportedException에 대한 예외처리 구현
            obj = super.clone();
        } catch(CloneNotSupportedException e){
        }
        return obj;
    }
}

//공변 반환 타입
class Conv implements Cloneable{
    int value;
    {
        value = 1;
    }
    public Conv clone(){ //반환타입을 바꾸어도 오버라이딩이 된다!
        Object obj = null;
        try{
            obj = super.clone();
        } catch (Exception e1){}
        return (Conv) obj;
    }
}