import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		// declare and initialize the program variables
		Scanner cin = new Scanner(System.in);
		String line = "";
		char a, b, c, d, e, f, g, h;
		double decNum = 0.00;
		String result = "";

		// display the program menu
		System.out.println("(Binary to Decimal Converter)\n");
		System.out.println("\nEnter an 8 - digit Binary Number\n");
		System.out.println("\nExample: 01101101 (positive only)\n");

		// input the sample binary number
		line = cin.nextLine();
		a = line.charAt(0);
		b = line.charAt(1);
		c = line.charAt(2);
		d = line.charAt(3);
		e = line.charAt(4);
		f = line.charAt(5);
		g = line.charAt(6);
		h = line.charAt(7);

		// assign a decimal weight to each digit
		if (a == '1') {
			a = '0';
		} else {
			a = '1';
			decNum = decNum + 128;
		}
		if (b == '1') {
			b = '0';
		} else {
			b = '1';
			decNum = decNum + 64;
		}
		if (c == '1') {
			c = '0';
		} else {
			c = '1';
			decNum = decNum + 32;
		}
		if (d == '1') {
			d = '0';
		} else {
			d = '1';
			decNum = decNum + 16;
		}
		if (e == '1') {
			e = '0';
		} else {
			e = '1';
			decNum = decNum + 8;
		}
		if (f == '1') {
			f = '0';
		} else {
			f = '1';
			decNum = decNum + 4;
		}
		if (g == '1') {
			g = '0';
		} else {
			g = '1';
			decNum = decNum + 2;
		}
		if (h == '1') {
			h = '0';
		} else {
			h = '1';
			decNum = decNum + 1;
		}

//		 if (a == '1') {
//		 decNum = decNum + 128;
//		 }
//		 if (b == '1') {
//		 decNum = decNum + 64;
//		 }
//		 if (c == '1') {
//		 decNum = decNum + 32;
//		 }
//		 if (d == '1') {
//		 decNum = decNum + 16;
//		 }
//		 if (e == '1') {
//		 decNum = decNum + 8;
//		 }
//		 if (f == '1') {
//		 decNum = decNum + 4;
//		 }
//		 if (g == '1') {
//		 decNum = decNum + 2;
//		 }
//		 if (h == '1') {
//		 decNum = decNum + 1;
//		 }

		// display the program output
		System.out.println("\nthe decimal equivalent of ");
		result = a + "" + b + "" + c + "" + d + "";
		result += e + "" + f + "" + g + "" + h;
		System.out.println(result);
		System.out.println("");
		System.out.println(" is " + decNum);
		cin.close();
	}
}
