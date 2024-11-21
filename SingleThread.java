public class SingleThread
{
    public static void main(String[] args)
    {
        long currentTime = System.nanoTime();
        int count =0;

        for(int i=0; i<1000000000; i++)
        {
            count++;
        }

        long endTime = System.nanoTime();
        System.out.println("Time passed: " + (endTime - currentTime) + " ns");
    }
}
