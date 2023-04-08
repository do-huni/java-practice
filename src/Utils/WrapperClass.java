class WrapperClass{
    public static void main(String[] args){
        //객체가 아닌 8가지 기본형을 객체화 시킨 것이 WrapperClass
        
        Boolean bo1 = new Boolean((boolean)true);
        
        Character ch1 = new Character((char)'a');
        
        Byte by1 = new Byte((byte)10);
        
        Short sh1 = new Short((short)21);
        
        Integer int1 = new Integer((int)77);
        
        Long long1 = new Long((long)222);
        
        Float float1 = new Float((float)0.21212);
        
        Double double1 = new Double((double)0.212122);
    }
}