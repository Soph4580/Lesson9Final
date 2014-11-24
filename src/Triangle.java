import TurtleGraphics.Pen;

public class Triangle extends AbstractShape {
    
    private double xpos2, xpos3, ypos2, ypos3;
    
    public Triangle(){
        super();
    }
   
    @Override
    public double area() {
       return Math.abs((xpos*ypos2-xpos2*ypos)+(xpos2*ypos3-xpos3*ypos2)+(xpos3*ypos-xpos*ypos3))/2;
    }

    public void draw(Pen p) {
       
    }

    public void move(double xloc, double yloc){
        
    }
    public void stretchBy(double factor) {
        xpos2=(xpos2-xpos)*factor+xpos2;
        xpos3=(xpos3-xpos)*factor+xpos3;
        ypos2=(ypos2-ypos)*factor+ypos2;
        ypos3=(ypos3=ypos)*factor+ypos3;
    }

    @Override
    public String toString() {
        
    }

   
    public double perimeter() {
       double p = Math.sqrt((xpos-xpos2)*(xpos-xpos2)+(ypos-ypos2)*(ypos-ypos2));
    }
    
}
