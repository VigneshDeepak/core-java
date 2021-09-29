package Looping;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		int week;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the day");
		week =input.nextInt();
		switch(week){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Its a weekend");
			break;
		}
		

	}

}
