package exception;
public class start{
	public static void main(String args[]) {
		try {
			throw new myex1("New Exception");
		}
		catch(myex1 ex) {
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
		}
		try {
		throw new myex("another exception");
		}
		catch(myex ex1) {
			System.out.println("another exception caught");
			System.out.println(ex1.getMessage());
		}
	}
}
