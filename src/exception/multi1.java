package exception;

public class multi1 {

	public static void main(String[] args) throws InterruptedException{
		operations op1=new operations();
		operations op2=new operations();
		operations op3=new operations();
		op1.setName("add");
		op2.setName("print");
		op3.setName("bank");
		op1.start();
		op2.start();
		op3.start();
	}

}
