class SuperClass{
    public static void main(String[] args){
        Second sec = new Second();
        
        sec.printSuper();
        sec.printThis();
    }
}
class Second extends First{
    
    int z;
    Second() {
        super(10,20);
        this.x += 1; //상속받은 값을 자식 인스턴스에서 변경
        this.y += 2;
        
    }
    void printSuper(){
        System.out.printf("%d\n%d\n", super.x, super.y);
    }
    void printThis(){
        System.out.printf("%d\n%d\n", this.x, this.y);
    }
}
class First {
    int x = 10;
    int y = 20;
    
    First() {}
    First(int x, int y){
        this.x = x;
        this.y = y;
    }
}