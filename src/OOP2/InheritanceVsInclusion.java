class InheritanceVsInclusion{
    public static void main(String[] args){
        /*
        [상속관계]
        class A extends B
        A is B
        A는 B이다(A는 B의 확장이다)
        
        [포함관계]
        class A{
            B newInstance = new B()
        }
        class B{}
        A has B
        A는 B를 가지고있다
        */
        Circle cir = new Circle();
        cir.draw();
        
        Point[] p = {
            new Point(0,0),
            new Point(3,4),
            new Point(3,0)
        };
        
        Triange tri = new Triange(p);
        tri.draw();
    }
}        
        
class Shape{
    String color = "black";
    void draw(){
        System.out.printf("[color=%s]%n", color);
    }
}

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }

    String getXY(){
        return x+", "+y;
    }
}

class Circle extends Shape{
    Point center;
    int r;

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }
    Circle(){
        this(new Point(), 4);
    }
    void draw(){
        System.out.printf("[center =(%d, %d), r = %d, color = %s]\n", this.center.x, this.center.y, this.r, this.color);
    }

}

class Triange extends Shape{
    Point[] p = new Point[3];
    
    Triange(Point[] p){
        this.p = p;
    }
    
    void draw(){
        System.out.printf("[p1 = (%d, %d), p2 = (%d, %d), p3 = (%d, %d), color = %s]\n", p[0].x,p[0].y,p[1].x,p[1].y,p[2].x,p[2].y,this.color);
    }
}
