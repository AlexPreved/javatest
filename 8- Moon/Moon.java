
import java.util.Scanner;

class Moon{
	public static void main (String args[]){
		
		double weight, moon;
		
		System.out.println();
		System.out.println();
		
		System.out.print("Input your Earth WEIGHT (kg): ");
		
		weight = new Scanner(System.in).nextInt();
		
		moon = weight*0.17;
		
		System.out.println("Your moon weight = " + moon + " kilograms.");
	}
}