package threads;

public class TestThreadImplements {

	public static void main(String[] args) {
		Thread thrd1=new Thread(new MyThread02());
		Thread thrd2=new Thread(new MyThread02());
		thrd1.start();
		thrd2.start();
		
		System.out.println("Threads started");
	
	}

}

class MyThread02 implements Runnable{
String[] monNames = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
	
@Override
	public void run() {
		for(String mon: monNames){
			System.out.println(Thread.currentThread().getName()+ " " + mon);
		}
	}


}