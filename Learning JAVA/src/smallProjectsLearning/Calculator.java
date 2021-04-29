package smallProjectsLearning;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers you want to perform an operation with");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("Enter the operation you want to perform");
		char operator = input.next().charAt(0);
		double answer = 0.0;
		
		switch (operator) {
		case '+' : answer = num1+num2;
		break;
		case '-' : answer = num1-num2;
		break;
		case '*' : answer = num1*num2;
		break;
		case '/' : answer = num1/num2;
		break;
		}
		System.out.println(num1+" "+operator+" "+ num2 + " is " + answer);
		
	}

}
