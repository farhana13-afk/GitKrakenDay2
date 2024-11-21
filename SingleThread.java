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

    // creating the multithreads takes longer than just using a single thread
    // because for the computer creating and operating multiple threads takes a lot longer
    // than just running the simple job
    // if you were to do a harder task or make it run for longer maybe the multithread would be more reasonable
    // computer has to identify a new thread and join onto it and use that new thread to run the code
    // which is a lot more work and time than just doing the easy task on the original thread
    // all under the category of overhead

}
