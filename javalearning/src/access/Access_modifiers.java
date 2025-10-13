package access;

public class Access_modifiers {
	
	public int publicVar = 25;
	private int privateVar = 40;
	protected int protectedVar = 30;
	int defaultVar = 10;
	
	
	public void show() {
		System.out.println("Public Variable: "+ publicVar); //access everywhere
		System.out.println("Private Variable: "+ privateVar); //access only inside the same class
		System.out.println("Protected Variable: "+ protectedVar); //inside class+same package+sub classes
		System.out.println("Default Variable: "+ defaultVar); //inside class and same packageS
	}

	public static void main(String[] args) {
		
		Access_modifiers am = new Access_modifiers();
		am.show();
		

	}

}
