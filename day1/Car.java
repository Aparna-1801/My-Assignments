package week1.day1;

public class Car {

	public void applyBreak() {
	System.out.println("Applied break ");	
	}
	
    public void soundHorn() {
    System.out.println("Sound Horn ");	
  	
	}

	public static void main(String[] args) {
		Car driver = new Car();
		driver.applyBreak();
		driver.soundHorn();

	}

}


/*Assignment 4:
========== 
Create package name as week1.day1 under src/main/java
- Create a  new class as "Car" under week1.day1
- Create 2 methods(applyBreak(),soundHorn())
applyBreak(){print as Applied break}
soundHorn(){print as sound horn}
-Create another class as Bike
-Call the methods of Car class in BikeClass by creating object for Car class and Bike Class
Hint Create two objects for the two classess*/
