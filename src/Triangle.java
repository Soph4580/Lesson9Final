import TurtleGraphics.Pen;

public class Triangle extends AbstractShape {
    
    private double xpos2, xpos3, ypos2, ypos3;
    private double Xd, Yd;
    
    public Triangle(){
        super();
        xpos2 = 50;
        ypos2 = 50;
        xpos3 = 100;
        ypos3 = 0;
        Xd = 0;
        Yd = 0;
    }
   
    public double area() {
       return Math.abs((xpos*ypos2-xpos2*ypos)+(xpos2*ypos3-xpos3*ypos2)+(xpos3*ypos-xpos*ypos3))/2;
    }
    
    
    public void draw(Pen p) {
        p.up();
        p.move(xpos,ypos);
        p.down();
        p.move(xpos2,ypos2);
        p.move(xpos3,ypos3);
        p.move(xpos,ypos);
    }
    
    @Override
    public void move(double xloc, double yloc){
        Xd = xloc - xpos;
        Yd = yloc - ypos;
        xpos = xloc;
        ypos = yloc;
        xpos2 = xpos2 + Xd;
        ypos2 = ypos2 + Yd;
        xpos3 = xpos3 + Xd;
        ypos3 = ypos3 + Yd;
    }
   
    public void stretchBy(double factor) {
        xpos2=(xpos2-xpos)*factor+Xd;
        xpos3=(xpos3-xpos)*factor+Yd;
        ypos2=(ypos2-ypos)*factor+Xd;
        ypos3=(ypos3=ypos)*factor+Yd;
    }

    
    public String toString() {
        String str = super.toString();
        str+= "Triangle\n" + "(X,Y,Z) Position: (";
        str+=  xpos + "," + ypos + "," + xpos2 + "," + ypos2 + "," + xpos3 + "," + ypos3;
        str+= ")\nArea: " + area()+ "\n" + "Perimeter: " + perimeter();
        return str;
    }

    
    public double perimeter() {
       double p = Math.sqrt((xpos-xpos2)*(xpos-xpos2)+(ypos-ypos2)*(ypos-ypos2));
       return p;
    }
    
}
