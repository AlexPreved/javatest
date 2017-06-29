import java.util.Scanner;

class Triangle {
	public static void main(String args[]){
		double z,y,x;
		
		System.out.print("Enter the length of the first leg of the triangle: ");
		x = new Scanner(System.in).nextInt();
		System.out.println();
		
		System.out.print("Enter the length of the second leg of the triangle: ");
		y = new Scanner(System.in).nextInt();
		System.out.println();
		
		z = Math.sqrt(x*x + y+y);
		System.out.printf
		("The hypotenuse of the triangle with the lengths of the legs %.2f and %.2f is %.3f santimeters. \n Good day! \n", x, y, z);
	}
}