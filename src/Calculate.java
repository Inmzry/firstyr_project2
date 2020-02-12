


import java.util.Scanner;

public class Calculate{
	
	public static int add(int num1, int num2) {
		return num1+num2;
	}
	public static int sub(int num1, int num2) {
			return num1-num2;
	}
	public static int mult(int num1, int num2) {
		return num1*num2;
	}
	public static int div(int num1, int num2) {
		return num1/num2;
	}
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	public static int powr(int num1, int num2) {
		return (int)Math.pow(num1, num2);
		
	}
public static void main(String[] args) {
	Scanner n = new Scanner(System.in);
	System.out.println("SIMPLE CALCULATOR");
	System.out.print("Input first number: ");
	int num1 = n.nextInt();
	System.out.print("Input second number: ");
	int num2 = n.nextInt();
	
	
	System.out.print("choices are +,-,/,*,% and ^: ");
	
	char operator = n.next().charAt(0);
	
	if(operator == '+') {
	System.out.println(num1+" + "+num2);
	System.out.println("= "+add( num1, num2));
	}
	if(operator == '-') {
		System.out.println(num1+" - "+num2);
		System.out.print("= "+sub( num1, num2));	
		}
	if(operator == '*') {
		System.out.println(num1+" * "+num2);
		System.out.print("= "+mult( num1, num2));	
		}
	if(operator == '/') {
		System.out.println(num1+" / "+num2);
		System.out.print("= "+div( num1, num2));	
		}
	if(operator == '%') {
		System.out.println(num1+" % "+num2);
		System.out.print("= "+mod( num1, num2));	
		}
	else if(operator == '^') {
		System.out.println(num1+" ^ "+num2);
		System.out.print("= "+powr( num1, num2));	
		}
	}
	
	

}

