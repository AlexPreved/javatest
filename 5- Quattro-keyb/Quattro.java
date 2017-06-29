
import java.util.Scanner;


public class Quattro {
    public static void main(String[] args) {
        int a;
		System.out.println("Input number. Press 'Enter'");
        a = new Scanner(System.in).nextInt();
        a = a*a;
        System.out.println("Result of quattring of your number: " + a + " .");
    }
}