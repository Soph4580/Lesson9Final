import TurtleGraphics.Pen;

public class Circle extends AbstractShape {

    protected double radius;
    
    public Circle(){
        super();
        radius=1;
    }
    
    public Circle(double xloc, double yloc, double r)
    {
        super(xloc, yloc);
        radius=r;
    }
     
    
     public double area() {
        return Math.PI*radius*radius;
    }

    
    public void draw(Pen p) {
        double side = 2.0*Math.PI*radius/120.0;
        p.up();
        p.move(xpos+radius, ypos-side/2.0);
        p.setDirection(90);
        p.down();
        
        for(int x=0; x<120; x++){
            p.move(side);
            p.turn(3);
        }
    }


    public void stretchyBy(double factor) {
       radius*=factor;
    }
    public String toString(){
    String str = "CIRCLE\n"+"Radius: " + radius + "\n"
    + "(X,Y) Position: (" + xpos + "," + ypos + ")\n"
    + "Area: " + area();
        return str;
}

public double perimeter(){
    return 2*Math.PI*radius;
    }
}
