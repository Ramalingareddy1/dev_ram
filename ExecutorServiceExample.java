import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(" Thread main Stared");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result= executorService.submit(new SumFirstNumbers(50));
        while(!result.isDone()){
            System.out.println(" Task is still Processing");
            Thread.sleep(5001);

        }

        System.out.println(" Task is finished: "  +result.isDone());
        System.out.println(" Task result: " + result.get());
         
        executorService.shutdown();

        System.out.println(" Thread main is finished");
    }
} 

class SumFirstNumbers implements Callable<Integer>{
    private int n;
     public SumFirstNumbers(int n){
        this.n=n;
     }

     public Integer call(){
        int sum=0;
        for( int i=0; i<n; i++){
            System.out.println("[" + Thread.currentThread().getName() + "] Adding " + i);
            sum+=i;
            try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

        }
        return sum;
        
     }
}

