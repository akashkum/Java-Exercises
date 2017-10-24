package threads;

public class TestThreadsExtends  {

	public static void main(String[] args) {
		
MyThread thrd1=new MyThread();
MyThread thrd2=new MyThread();
thrd1.setName("Thrd1");
thrd2.setName("Thrd2");
thrd1.start();
thrd2.start();
Thread thrd3=Thread.currentThread();
System.out.println(thrd3.getName());
System.out.println("Threads Started Working");

	}

}
class MyThread extends Thread{
String[] monNames = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
	@Override
	public void run() {
		for(String mon: monNames){
			System.out.println(super.getName()+ " " + mon);
		}
	}
	
}