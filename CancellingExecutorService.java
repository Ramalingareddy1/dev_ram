
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CancellingExecutorService {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("Thread main started");
		
		ExecutorService executorService = Executors.newCachedThreadPool();

		SumFirstNumbers sumTask = new SumFirstNumbers(5000);
		Future<Integer> result = executorService.submit(sumTask);

		Thread.sleep(5);
		result.cancel(true);
		
		executorService.shutdown();

		System.out.println("Thread main finished");
	}
}

class SumFirstNumbers implements Callable<Integer> {
	private int n;
	
	public SumFirstNumbers(int n) {
		this.n = n;
	}
	
	public Integer call() {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] Adding " + i);
			sum += i;
			
			if (Thread.interrupted()) {
				System.out.println("Cancelling the task...");
				return -1;
			}
		}
		return sum;
	}
}


    

