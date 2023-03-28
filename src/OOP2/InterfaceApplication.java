class InterfaceApplication{
    public static void main(String[] args){
        Barrack b1 = new Barrack(0,0, 20);
        b1.liftOff();
        System.out.println(b1.fly);
        b1.stop();
        b1.move(4,10);
        System.out.println(b1.xLoc);
        System.out.println(b1.yLoc);
        
    }
}

interface Liftable{
    
    Boolean liftOff();
    
    int[] move(int x, int y);
    
    void stop();
    
    Boolean land();
}

class Building{
    Boolean fly;
    int xLoc;
    int yLoc;
    
    int hp;
    final int MAXHP;
    
    {
        this.fly = false;
    }
    
    Building(int xLoc, int yLoc, int hp){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.hp = hp;
        this.MAXHP = hp;
    }
}

class Academy extends Building{
    
    Academy(int xLoc, int yLoc, int hp)    {super(xLoc, yLoc, hp);}
}

class Bunker extends Building{

    Bunker(int xLoc, int yLoc, int hp)    {super(xLoc, yLoc, hp);}    
}

class Barrack extends Building implements Liftable{
    LiftableManager lm = new LiftableManager();
    Barrack(int xLoc, int yLoc, int hp)    {super(xLoc, yLoc, hp);}
    public Boolean liftOff()    {
        this.fly = lm.liftOff();
        return this.fly;
    }
    public int[] move(int x, int y) {
        int[] result = lm.move(x,y);
        this.xLoc += result[0];
        this.yLoc += result[1];
        return result;
    }
    public void stop()    {
        lm.stop();
    }
    public Boolean land()    {
        this.fly = lm.land();
        return this.fly;
    }
}

class LiftableManager implements Liftable{
    public Boolean liftOff()    {System.out.println("건물을 띄웁니다.");
                      return true;}
    public int[] move(int x, int y){
        return (new int[]{x, y});
    }
    public void stop()    {System.out.println("건물을 멈춥니다.");}
    public Boolean land()    {
        System.out.println("건물을 내립니다.");
                      return false;
    }
}