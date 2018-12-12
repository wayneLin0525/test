package SixFormOfThread;

public class ThreadDemo extends Thread {

	@Override
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+" is running...");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		td.start();
		
		while(true){
			System.out.println(Thread.currentThread().getName()+" is running...");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
