package exceptionhandling;
//Program to demonstrate Multiple catch block
import java.util.InputMismatchException;
import java.util.Scanner;
	
public class Multiplecatch {
	public static void main(String[] args) {
		System.out.println("I am in main method");
		int numberOne, numberTwo, numberThree;
		Scanner s = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Enter First number: ");
				numberOne = s.nextInt();
				System.out.println("Enter Second number: ");
				numberTwo = s.nextInt();
				numberThree = numberOne / numberTwo;
				System.out.println("Division is " + numberThree);
				//break;
				
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("Invalid input. Please enter integers only.");
				s.nextLine();
				
				  } catch (ArithmeticException e) { System.out.println("Arithmetic Exception caught: " +
				  e.getMessage()); // break;
				  
				  
				  } catch (Exception e) {
				System.out.println("Exception caught: " + e.getMessage());
				// break;
			}
		}
	}
}