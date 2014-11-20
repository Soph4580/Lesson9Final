import TurtleGraphics.Pen;

public class Rect extends AbstractShape {
    
    private double width, length;
    
    public Rect(){
        super();
        width=1;
        length=1;
    }
    
    public Rect(double xloc, double yloc, double w, double l)
    {
        super();
        width= w;
        length= l;
    }
    
    public double area() {
        return width*length;
    }

   
    public void draw(Pen p) {
        p.up();
        p.move(xpos, ypos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(length);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(length);
    }

    
    public void stretchBy(double factor) {
       length*=factor;
       width*=factor;
    }
    public String toString(){
    String str = "RECTANGLE\n" + "Width: " + width + "\nHeight: " + length
    + "\n(X,Y) Position: (" + xpos + "," + ypos + ")\nArea: " + area()
    + "Perimeter: " + perimeter();
    return str;
}

public double perimeter(){
    return width*2+length*2;
    }
}
