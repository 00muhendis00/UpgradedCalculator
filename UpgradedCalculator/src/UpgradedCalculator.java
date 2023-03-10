import java.util.Scanner;
public class UpgradedCalculator {
	static void plus() {
		Scanner input = new Scanner(System.in);
		double number,result=0;
		while(true) {
			System.out.print("Enter a number ");
			number = input.nextDouble();
			if(number == 0) {
				break;
			}
			result += number;
		}
		System.out.print("Result is " + result);
	}
	
	static void minus() {
		Scanner input = new Scanner(System.in);
		int count ;
		double result = 0, number;
		System.out.print("How many numbers will you enter? ");
		count = input.nextInt();
		for (int i=1;i<=count;i++) {
			System.out.print(i + ". number ");
			number = input.nextDouble();
			result -= number;
		}
		System.out.print("Result is " + result);
	}
	
	static void times() {
		Scanner input = new Scanner(System.in);
		double number,result=1,i=0;
		while (true) {
			System.out.print(i++ + ". number " );
			number = input.nextDouble();
			if(number == 0) break;
			else {
				result *= number;
			}
		}
		System.out.print("Result is " + result);
	}
	
	static void division() {
		Scanner input = new Scanner(System.in);
		double number,count, result = 1;
		System.out.print("How many numbers will you enter?");
		count = input.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.print(i + ". sayı ");
			number = input.nextDouble();
			if(i!=1 && number == 0) {
				System.out.println("Divider 0 cannot be entered");
				continue;
			}
			if(i==1) {
				result = number;
				continue;
			}
			result /= number;
		}
		System.out.println("Sonuç " + result);
	}
	
	static void power() {
		int base,exponent,result=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value ");
		base = input.nextInt();
		System.out.println("Enter exponent " );
		exponent = input.nextInt();
		for(int i=1;i<=exponent;i++) {
			result *=base;
		}
		System.out.println("Result is " + result);
	}
	
	static void Factorial() {
		int number,result=1;
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		
		for(int i=1;i<=number;i++) {
			result *= i;
		}
		System.out.print("Result " + result);
	}
	
	static void GetMod() {
		int num,count,result=0;
		Scanner input=new Scanner(System.in);
		System.out.println("How many numbers will you enter?" );
		count = input.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println(i + ". sayı");
			System.out.println("Enter a number ");
			num = input.nextInt();
			result = num % 10;
			System.out.println("Result is " + result);
		}
	}
	
	static void Area() {
		int short_edge , long_edge,result=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Short edge is " );
		short_edge = input.nextInt();
		System.out.println("Long_edge is " );
		long_edge = input.nextInt();
		
		if (short_edge <= 0 || long_edge <= 0) {
			System.out.println("Error! Please try again.");
		}
		else {
			result = short_edge * long_edge;
		}
		
		System.out.print("The area of reactangle " + result);
	}
	
	static void Perimeter() {
		int short_edge , long_edge,result=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Short edge is " );
		short_edge = input.nextInt();
		System.out.println("Long_edge is " );
		long_edge = input.nextInt();
		
		if (short_edge <= 0 || long_edge <= 0) {
			System.out.println("Error! Please try again.");
		}
		else {
			result = 2 * (short_edge + long_edge);
		}
		
		System.out.print("The perimeter of reactangle " + result);
	}
	
	static void main(String[] args) {
		int operation_type;
		 System.out.println("1- Toplama İşlemi\n"
	                + "2- Subtraction\n"
	                + "3- Multiplication\n"
	                + "4- Division Operation\n"
	                + "5- Exponent Calculation\n"
	                + "6- Factorial Calculation\n"
	                + "7- Get Mod\n"
	                + "8- Rectangular Area and Perimeter\n"
	                + "0- Sign Out");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a operation type " );
		operation_type = input.nextInt();
		switch (operation_type) {
		case 1:
			plus();
			break;
		case 2:
			minus();
			break;
		case 3:
			times();
			break;
		case 4:
			division();
			break;
		case 5:
			power();
			break;
		case 6: 
			Factorial();
			break;
		case 7:
			GetMod();
			break;
		case 8:
			Area();
			break;
		case 9 :
			 Perimeter();
			break;
		case 0 :
			 System.out.print("Exiting the system.");
			break;
		default:
			System.out.println("Error! Please, Try again..");
		}
	}
}
