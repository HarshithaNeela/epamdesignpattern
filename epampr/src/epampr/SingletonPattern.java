package epampr;
import java.util.*;
public class SingletonPattern {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
		   singleton object = singleton.getInstance();
                    
	      //show the message
		   System.out.println("enter values to add");
		   Scanner s=new Scanner(System.in);
		 int a=s.nextInt();
		   int b=s.nextInt();
	      object.add(a,b);
	      object.sub(a,b);
	   }
	}