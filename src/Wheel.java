import TurtleGraphics.Pen;

public class Wheel extends Circle {
    private int spokes;

    public Wheel(){
    super();
    spokes=0;//Activates constructor
    }

public Wheel(double xloc,double yloc,double r,int s){
    super(xloc, yloc, r);
    spokes=s;
    }

public void draw (Pen p){
    super.draw(p); //Drawing the rim

    //Draw the spokes
    for(int i=1; i<=spokes; i++){
        p.up();
        p.move(xpos,ypos);
        p.setDirection(i*360/spokes);
        p.down();
        p.move(radius);
    }
}

public void setSpokes(int s){
    spokes=s;
}

public String toString(){
    String str = "WHEEL\n" + "Radius: " + radius + "\n" + "Spokes" + spokes + "\n"+ "(X,Y) Position: (" + xpos + "," + ypos + ")\nArea: " + area();
    return str;
}
}
    

