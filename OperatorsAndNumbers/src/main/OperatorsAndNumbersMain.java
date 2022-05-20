package main;

public class OperatorsAndNumbersMain {

	public static void main(String[] args) {
		// 1 => 0001
		// 8 => 1000
		// 33 => 0010 0001
		// 78 => 0100 1110
		// 787 => 0011 0001 0011
		// 33987 => 1000 0100 1100 0011
		
		// 0010 => 2
		// 1001 => 9
		// 0011 0100 => 52
		// 0111 0010 => 114
		// 0010 0001 1111 => 543
		// 0010 1100 0110 0111 => 11367
		
//		int x = 88;
//		System.out.println(Integer.toBinaryString(x));
//		x <<= 1;
		
		// x = 2 Predicted values: 100, 4
		// x = 9 Predicted values: 18, 10010, 18
		// x = 17 Predicted values: 100010, 34
		// x = 88 Predicted values: 10110000, 176
//		System.out.println(x);
//		System.out.println(Integer.toBinaryString(x));
		
//		int x = 32456;
//		System.out.println(Integer.toBinaryString(x));
//		x >>= 2;
		
		// x = 150 Predicted values: 10010100, 37
		// x = 225 Predicted values: 111000, 56
		// x = 1555 Predicted values: 388, 110000100
		// x = 32456 Predicted values: 8114, 1111110110010
//		System.out.println(x);
//		System.out.println(Integer.toBinaryString(x));
		
//		int x = 7;
//		int y = 17;
//		int z;
		
		// z = x & y = 1 = 1
		// z = x | y = 23 = 10111
//		z = x | y;
//		
//		System.out.println(z);
//		System.out.println(Integer.toBinaryString(z));
		
//		int a = 16;
//		System.out.println(a);
//		a++;
//		System.out.println(a);
		
//		int b = 9;
//		System.out.println(b);
//		b++;
//		System.out.println(b);
//		b += 1;
//		System.out.println(b);
//		b = b + 1;
//		System.out.println(b);
		
		int x = 5;
		int y = 8;
		
		int sum = x++ + y;
		System.out.println(sum);
	}
}
