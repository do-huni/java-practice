class StringClass{
    public static void main(String[] args){
        //new String("1") vs "1"
        String str1 = new String("1");
        String str2 = new String("1");
        
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        
        String str3 = "1";
        String str4 = "1";
        
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        
        //""의 정체
        String str5 = "";
        System.out.println(str5.length());
    }
}