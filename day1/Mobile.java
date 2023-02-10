package week1.day1;

public class Mobile {

	public void makecall() {
		
		 String mobileModel = "Redmi";
		 float mobileWeight = 12.5f;
		   
	    System.out.println("The mobile model is "  + mobileModel   + " and " + "the mobie weight is "  +mobileWeight);
    }
    
	public void sendMsg() {
		
	    boolean isFullCharged=true;
	    int mobileCost= 25000;

	    System.out.println("The mobile is fully charged: "  + isFullCharged   + " and " +  "the mobie cost is "  + mobileCost);
	    		
	}

	public static void main(String[] args) {
    
		//classname Object=new Classname();
        Mobile calling = new Mobile();
	    calling.makecall();
	    calling.sendMsg();
	    System.out.println("This is my Mobile");

	}
}

/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console */


	    
	    
		

        
	


