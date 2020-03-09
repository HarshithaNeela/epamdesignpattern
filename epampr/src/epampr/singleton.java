package epampr;

public class singleton {
	


		   //create an object of SingleObject
		   private static singleton instance = new singleton();

		   //make the constructor private so that this class cannot be
		   //instantiated
		   private singleton(){}

		   //Get the only object available
		   public static singleton getInstance(){
		      return instance;
		   }

		   public void add(int a,int b){
			      System.out.println(a+b);
			   }
		   public void sub(int a,int b){
			      System.out.println(a-b);
			   }

		}
	
	
	
	
	

