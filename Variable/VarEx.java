class VarEx{
    public static void main(String[] args){
        int year = 0;
        int age = 14;
        
        System.out.println(year);
        System.out.println(age);
        
        //VarExchange
        int x = 10;
        int y = 5;
        int tmp;
        System.out.println("x:" + x + " y:" + y);
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x:" + x + " y:" + y);
    }
}