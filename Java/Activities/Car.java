package activities;

public class Car {
	String color;
    int make;
    String transmission;
    int tyres;
    int doors;
    //Constructor
	Car() {
		tyres =4;
		doors =4;
		}
	public void displayCharacterstics() {
	System.out.println("Color of car " +  color);
	System.out.println("Make of car " +  make);
	System.out.println("Transmission of car " +  transmission);
	System.out.println("No. of tyres " +  tyres);
	System.out.println("No. of doors " +  doors);

}
	   public void accelerate() {
		   System.out.println("Car is moving forward");
		   
	   }
	   public void brake() {
		   System.out.println("Car has stopped");
		   
	   }
}
