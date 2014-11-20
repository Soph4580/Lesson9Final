import TurtleGraphics.Pen;

abstract public class AbstractShape implements Shape {
    
    protected double xpos, ypos;
    
    public AbstractShape(){
        xpos=0;
        ypos=0;
    }
    
    public AbstractShape(double xloc, double yloc){
        xpos=xloc;
        ypos=yloc;
    }
    abstract public double area();
    abstract public void draw(Pen p);
    abstract public void stretchBy(double factor);
    abstract public double perimeter();
    
    public double getxpos(){
        return xpos;
    }         
    
    public double getypos(){
        return ypos;
    }
    
    public void move(double xloc, double yloc){
        xpos=yloc;
        ypos=yloc;
    }
    public String toString(){
        String str = "X-Y position" + xpos + "," + ypos;
        str+= "\nArea" + area();
        return str;
    }
    
    
    
    
    
}
