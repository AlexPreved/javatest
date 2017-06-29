
import java.util.Scanner;


public class EqualsKeyb {
    public static void main(String[] args) {
        int a, b, c;
		System.out.println("Please, Input first number. Press 'Enter':");
        a = new Scanner(System.in).nextInt();
		System.out.println();
        
		System.out.println("Please, Input second number. Press 'Enter':");
        b = new Scanner(System.in).nextInt();
		System.out.println();
		
		c = a + b;
		
        System.out.println("Result of equaling of your numbers: " + c + " .");
		System.out.println("Thank you!");
		System.out.println();
    }
}