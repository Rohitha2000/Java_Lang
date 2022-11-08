package com.java.Basics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1, b1; // a=1 b=1

		int[] a[], b; // a=2 b=1

		int[][] a2, b2; // a=2, b=2

		// int[] a, []b; error

		// int[] a, []b, []c error

		int[][] a3, b3[]; // a =2, b=3

		char String = 'd';
		// int[] arr[]= new int[5][-3]; #NegativeArraySizeException

		int[] ar = new int['a']; // char to int conversion

		byte b11 = 33;
		int[] ar1 = new int[b11]; // byte to int is possible. No data loss

		int[] arr[] = new int[5][3];
		System.out.println(arr.getClass().getName()); // [[I
		System.out.println(((Object) String).getClass().getSimpleName());

		System.out.println(args.length);

		boolean bb;
		// System.out.println(bb);

		String str;
		System.out.println(ar[0]);

		// System.out.print(ar[2.3]); loss of precision

		String[] str1 = { "A", "aaa", "bbb" };
		System.out.println(str1.length);
		System.out.println(str1[0].length());

		// Anonymous Arrays
		sum(new int[] { 23, 4, 88, 9 });

		ar[0] = 11;
		ar[1] = 'a';
		byte b12 = 22;
		ar[2] = b12;
		short srt = 33;
		ar[3] = srt;

		// ar[4]= 10L is invalid as type cannot be converted from long to int

		Number[] num = new Number[5];
		num[0] = new Integer(99);
		num[1] = new Double(2.33);

		// num[2]= new String("sdsds");
		// Number is a class which accepts byte, short, int, long, float, double data types.
		
		int amr1[]= {23,44,66,7};
		int amr2[][]= new int[2][];
		// amr2= amr1; array dimension must be matched to copy array to other array.

	}

	// method to perform on anonymous array

	public static void sum(int x[]) {
		int total = 0;
		for (int x1 : x) {
			total = total + x1;

		}

		System.out.println("Total Sum is : " + total);
	}

}
