package exceptionhandling;

public class Trycatch {
//program to demonstrate try catch block
	public static void main(String[] args) {
		System.out.println("I am in main method");
		int result;
		try {
            result = Trycatch.performDivision(12, 0);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");

			result = Trycatchexample.performDivision(12, 3);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(Trycatchexample.performDivision(12f, 5f));

		System.out.println("------------------------------");
		System.out.println(Trycatchexample.performDivision(12f, 0f));

	}

	private static int performDivision(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
