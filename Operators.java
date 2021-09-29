package operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		byte a=11;
		byte b=12;
		int c=a+b;
		Scanner input =new Scanner(System.in);
		
		c += 10; /* you can write c=a+b or c += num 
					and use any kind of arithmatic operator */
	
		//operators
		
		byte ageOfBride = 20;
		byte ageOfGroom = 25;
		
	
		String eg = "Any";
		String eg1 = "Desk";
		String name = input.nextLine();
		
		System.out.println(name);
		System.out.println(a % b);
		System.out.println(c);
		System.out.println(ageOfBride >= 18 && ageOfGroom >= 21); 	//using and operator
		System.out.println(eg + " " + eg1); 	//string concatenation
		System.out.println(eg.concat(eg1)); 	//another method of string concatenate
	}

}
