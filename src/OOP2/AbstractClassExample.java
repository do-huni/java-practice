class AbstractClassExample{
    public static void main(String[] args){
        tile[][] tileArray = {
            {new tile(0), new tile(0), new tile(1)},
            {new tile(1), new tile(1), new tile(1)},
            {new tile(0), new tile(1), new tile(0)}
        };
        
        Unit[] unitArray = {new Marine(1,1), new Marine(2,0), new DropShip()};
        for (int i = 0; i<unitArray.length; i++){
            System.out.println(unitArray[i].getClass().getName());
            unitArray[i].move(0,0, tileArray); //-> 땅
            unitArray[i].move(0,2, tileArray); //-> 언덕    
        }

    }
}

class tile{
    Boolean ifHill;
    
    tile(){
        this.ifHill = false;
    }
    tile(Boolean x){
        this.ifHill = true;
    }
    tile(int x){
        if (x == 0){
            this.ifHill = false;
        }
        if (x == 1){
            this.ifHill = true;
        }
    }
}
abstract class Unit{
    int x, y;
    Boolean fly;
    
    abstract void move(int x, int y, tile[][] tileArray);
    abstract void attack();
    void hold() {};
}

class Marine extends Unit{
    {
        this.fly = false;
    }
    Marine(){
        this(0, 0);
    }
    Marine(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    void move(int x, int y, tile[][] tileArray){
        if (tileArray[x][y].ifHill != tileArray[this.x][this.y].ifHill) {
            System.out.printf("현재 위치: (%d,%d,%s), 목표 위치: (%d,%d,%s)\n이동할 수 없습니다.\n", this.x, this.y, (tileArray[this.x][this.y].ifHill) ? "언덕" : "땅", x, y, (tileArray[x][y].ifHill) ? "언덕" : "땅");
        } else{
            System.out.printf("현재 위치: (%d,%d,%s), 목표 위치: (%d,%d,%s)\n이동합니다.\n", this.x, this.y, (tileArray[this.x][this.y].ifHill) ? "언덕" : "땅", x, y, (tileArray[x][y].ifHill) ? "언덕" : "땅");
        }
    }
    void attack(){};
}

class DropShip extends Unit{
    {
        this.fly = true;
    }
    DropShip(){
        this(0, 0);
    }
    DropShip(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    void move(int x, int y, tile[][] tileArray){
        System.out.printf("현재 위치: (%d,%d,%s), 목표 위치: (%d,%d,%s)\n이동합니다.\n", this.x, this.y, (tileArray[this.x][this.y].ifHill) ? "언덕" : "땅", x, y, (tileArray[x][y].ifHill) ? "언덕" : "땅");
    }
    void attack(){};
}