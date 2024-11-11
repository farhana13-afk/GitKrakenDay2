import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class GitKrakenDay2 implements Callable<Long>
{

    static int size = 1000;
    static ExecutorService executorService = Executors.newFixedThreadPool(size);
    public static void main(String[] args)
    {
        Future<Long> future = executorService.submit(new GitKrakenDay2());

        long total = 0;
        for(int i=0; i<size; i++)
        {
            try
            {
                total += future.get();

            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            } catch (ExecutionException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Total is: " + total);
    }

    //checking up
    @Override
    public Long call() {
        long sum =0;
        for(int i=1; i<=1000000; i++)
        {
            sum += i;
        }
        return sum;
    }
}
