package exception;
class mythread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
	}
}
public class demo {

	public static void main(String[] args) {
		mythread t=new mythread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}

}
