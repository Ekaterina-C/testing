import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		int i, j, k;
		i = j = k = 2;
		System.out.println(i + j + k);
		
		double miles = 100.0;
		final double KILLOMETRS_PER_MILE = 1.609;
		double kilometers = miles * KILLOMETRS_PER_MILE;
		
		System.out.println(kilometers);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a byte value: ");
		byte byteValue = input.nextByte();
		
		
		System.out.println("Enter a short value: ");
		short shortValue = input.nextShort();
		
		System.out.println("Enter an int value: ");
		int intValue = input.nextInt();
		
		System.out.println("Enter a long value: ");
		long longValue = input.nextLong();
		
		System.out.println("Enter a float value: ");
		float floatValue = input.nextFloat();
		
//		(6+10) % 7 is 2, day 6 in week is Saturday, a week has 7 days, after 10 days,
//		day 2 in a week is Tuesday; note 0 in a week is Sunday.
		
	
		
		
		
		
		
		
		
		

	}

}
