import java.util.Scanner;

public class ComputerAreaWithConsoleIntput {

	public static void main(String[] args) {
// Declare a constant
		
		final double PI = 3.14159; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for radius: ");
		
		double radius = input.nextDouble();
		double area = radius * radius * PI;
		
		System.out.println("The area for the circle of radius " + radius +
				" is " + area);
		
		

	}

}
