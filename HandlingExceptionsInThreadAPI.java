import java.lang.Thread.UncaughtExceptionHandler;

public class HandlingExceptionsInThreadAPI {
	
	public static void main(String[] args) {
		
		System.out.println("Thread main started");
		
		Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Handling the Exception occured in thread " + t.getName());
			}
		});
		
		new MyTask().start();
		new MyTask().start();	
		
		System.out.println("Thread main finished");
	}
}

class MyTask extends Thread {
	public void run() {
		throw new RuntimeException();
	}
}