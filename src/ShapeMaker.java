import TurtleGraphics.*;
import TerminalIO.*;
import java.awt.Color;

public class ShapeMaker {

   
    public static void main(String[] args) {
        
      Rect rect;
      Shape shape1, shape2, shape3;
      rect= new Rect(1,1,4,6);
      
      shape1= makeOneShapeFromAnother (rect, "circle");
       shape2= makeOneShapeFromAnother (rect, "rectangle");
        shape3= makeOneShapeFromAnother (rect, "wheel");
      
      System.out.println("\nRectangle Area: " + rect.area() + "\nCircle Area: " + shape1.area() + "\nRectangle Area: " + shape2.area() + "\nWheel Area: " + shape3.area());
      }
    
    static private ShapeMaker makeOneShapeFromAnother (Shape inShape, String type){
        Shape outShape;
        //Declare outShape
        double area, radius, width, length;
        double x = inShape.getxpos();
        double y = inShape.getypos();
        
        area = inShape.area();
        if(type.equals("Circle")){
            radius = Math.sqrt(area/ Math.PI);
            outShape = new Circle (x, y, radius);
            //Assign a circle
        }
        else if (type.equals("Rectangle")){
            width = length = Math.sqrt(area);
            outShape = new Rect (x, y, radius, 6);
            
            //Assign a wheel
        }
         return outShape;   
        }
        
    } 
    
}
