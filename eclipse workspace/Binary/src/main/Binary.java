package main;
public class Binary{
	public static void main(String args[])
	{
		String binary = "01111111111111111111111111111111";
		// there are                     2147483648 different combinations which include zero so  
		// the decimal number goes up to 2147483647.
		// the first bit is excluded and used to determine if 
		// its a positive decimal or negative.
		System.out.println(Integer.parseInt(binary,2));
		System.out.println(Integer.MAX_VALUE);
		
		int ya = 0b1111111111111111111111111111111;
		System.out.println("here: " + ya);
		
		int decimal = 5;
		String decimalToBinary = Integer.toBinaryString(decimal);
		System.out.println(decimalToBinary);
		
		
		while (decimalToBinary.length() < 32)
			decimalToBinary = "0" + decimalToBinary;
		System.out.println(decimalToBinary);
	}
}