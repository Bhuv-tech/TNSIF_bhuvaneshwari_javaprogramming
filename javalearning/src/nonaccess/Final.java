package nonaccess;

public class Final {

		int Max = 100;
	
	 void display() {
		System.out.println("Show the value of max:  "+Max);
	}

	public static void main(String[] args) {
		Final fd = new Final();
	    fd.Max = 300;
		fd.display();
		
		
	}

}

class Child extends Final{
	
	
	void display() { //cannot override the final method from final solution remove final modifier of final display
		System.out.println("Show the value of max:  "+Max);
	}
}
