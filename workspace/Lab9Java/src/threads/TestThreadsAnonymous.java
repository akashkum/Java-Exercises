package threads;

public class TestThreadsAnonymous {

	public static void main(String[] args) {
		String[] monNames = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
		Thread thrd1=new Thread(){
			@Override
			public void run(){
				for(String mon: monNames){
					System.out.println(super.getName()+ " " + mon);
				}
			}
		};

		Thread thrd2=new Thread(){
			@Override
			public void run(){
				for(String mon: monNames){
					System.out.println(super.getName()+ " " + mon);
				}
			}
		};
	thrd1.start();
	thrd2.start();
	try {
		thrd1.join();
		thrd2.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	try {
		thrd1.sleep(3000);//Thread goes to sleep
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//thrd1.start(); you cannot restart thread
	System.out.println("Both Threads Started");
		
	}

}
