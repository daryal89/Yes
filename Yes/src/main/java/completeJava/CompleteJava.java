package completeJava;

public class CompleteJava {
	/*
	 * Multi-Line comment
	 */

	public static void main(String[] args) {
		// Single line comment

		System.out.println("Hello Java");

		// Variables can hold data x,y are variables below
		int x = 10;
		int y = 20;
		int c = x + y;
		System.out.println("result = " + c);

		// if else statement
		if (x < y) {
			System.out.println("x is less than y");
		} else if (x == y) {
			System.out.println("x is equal to y");

		} else {
			System.out.println("x is greater than y");
		}

		// for loop
		// for(initial value; condition; increment/decrement; i++ = i+1
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = " + i);
		}

		// While loop
		x = -10;
		while (x <= 0) {
			System.out.println("x = " + x);
			// x++;
			// x=x+1;
			x += 2;
		}

		// Do While
		// Execute a block of code at least once
		x = 10;
		do {
			System.out.println("x= " + x);
			x--;
		} while (x > 0);

		// And or
		x = 10;
		y = -10;
		if (x > 0 && y > 0) {
			System.out.println("Both number are +ve");
		} else if (x > 0 || y > 0) {
			System.out.println("One number is +ve");
		} else {
			System.out.println("Both number are -ve");
		}

		// swicth case statement

		int j = 7;

		switch (j) {
		case 0:
			System.out.println("Value is 0");
			break;
		case 1:
			System.out.println("Value is 1");
			break;

		case 2:
			System.out.println("Value is 2");
			break;

		case 3:
			System.out.println("Value is 3");
			break;

		case 4:
			System.out.println("Value is 4");
			break;

		default:
			System.out.println("Value is none");
			break;
		}

		/*
		 * double D=10.12; switch (D) { case 1.0: System.out.println("Value is 1.0");
		 * break; case 5.0: System.out.println("Value is 5.0"); break;
		 * 
		 * case 10.12: System.out.println("Value is 10.12"); break;
		 * 
		 * default System.out.println("Value is not in the switch"); break; }
		 * 
		 * 
		 * //String switch String k = "Two"; switch (k) { case "Zero":
		 * System.out.println("Value is 0"); break; case "One":
		 * System.out.println("Value is 1"); break;
		 * 
		 * case "Two": System.out.println("Value is 2"); //break;
		 * 
		 * default: System.out.println("Value is default"); //break;
		 * 
		 * }
		 */

		// Arrays
		// Storing large amount of uniform data is in array.
		// int a=10; int b=20; int e=30; int d=40;
		int A[] = { 10, 20, 30, 40, 50 };
		System.out.println(A[0] + " " + A[3]);

		// enhanced for loop
		for (int temp : A) {
			System.out.println(temp);
		}

		System.out.println("----------------");
		// The default value of int array is zero if we don't give any value in it.
		int B[] = new int[5];
		B[0] = 2;
		B[1] = 4;
		for (int b : B) {
			System.out.println(b);
		}

		System.out.println("----------------------");
		// The default is null value for String
		String[] s = new String[5];
		s[0] = "mohan";
		s[1] = "hari";
		for (String temp1 : s) {
			System.out.println(temp1);
		}

		// Two dimensional Array

		int[][] t = new int[4][3];
		int temp2 = 10;

		for (int i = 0; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				t[i][j] = temp2;
				temp2 += 10;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}

		// String Manipulation
		String p = "hello friend";
		System.out.println("String is: " + p);
		System.out.println(p.toUpperCase());
		System.out.println(p.substring(3));
		System.out.println(p.substring(0, 4)); // excludes the last index
		System.out.println(p.charAt(4));

		// Converting from String to int
		String age = "40";
		String salary = "10000";

		// Wrapper Classes
		int q = Integer.parseInt(age) / 2;
		System.out.println(q);

		int r = Integer.parseInt(salary) + 1000;
		System.out.println(r);

		// Converting from int to String
		int a = 100;
		int b = 200;
		
		String str = String.valueOf(a)+"100";
		String str1 = String.valueOf(b)+ "MY Movie";
		
		System.out.println(str);
		System.out.println(str1);
		
		
		

	}

}
