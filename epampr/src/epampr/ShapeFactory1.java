package epampr;
import java.util.HashMap;
public class ShapeFactory1 {
	



	  
	   private static final HashMap circleMap = new HashMap();

	   public static Shape1 getCircle(String color) {
	      Circle1 circle = (Circle1)circleMap.get(color);

	      if(circle == null) {
	         circle = new Circle1(color);
	         circleMap.put(color, circle);
	         System.out.println("Creating circle of color : " + color);
	      }
	      return circle;
	   }
	}


