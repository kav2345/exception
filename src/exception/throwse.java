package exception;

public class throwse {

	public static void main(String[] args) {
		checkage(14);
}
	static void checkage(int age)throws ArithmeticException{
		if(age<18) {
			throw new ArithmeticException("youmust be 18 or above 18 to vote");
			
	}
		else {
			System.out.println("you are eligible");
		}
	}
}