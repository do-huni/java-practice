class MemberCall{
    int iv = 10;
    static int cv = 20;
    
    int iv2 = cv; //인스턴스변수에 클래스변수 대입 가능
    //static int cv2 = iv; 클래스변수에 인스턴스변수 대입 불가능
    static int cv2 = new MemberCall().iv; //객체를 생성한 후 인스턴스변수를 대입해야함
    
    static void staticMethod1(){
        System.out.println(cv);
        //System.out.println(iv); 클래스메서드에 인스턴스변수 대입 불가능
        System.out.println(new MemberCall().iv);
    }
    
    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }
    
    static void staticMethod2(){
        staticMethod1();
        //instanceMethod1();
        new MemberCall().instanceMethod1();
    }
    
    void instaceMethod2(){
        staticMethod1();
        instanceMethod1();
    }
    
    public static void main(String[] args){
        staticMethod2();
    }
}