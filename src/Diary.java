import java.util.ArrayList;
import java.util.Iterator;

public class Diary {


    private ArrayList <Job> jobs;
    private int[] jobcount;

    public Diary()
    {
        jobs = new ArrayList<> ();
        jobcount = new int [6];
    }


    public void listAllJobs()
    {
        Iterator<Job> it = jobs.iterator ();
        while (it.hasNext())
        {
            Job j = it.next();
            if (j.isComplete())
            {
                it.remove();
            }
        }

    }

    public static void main(String[] args) {

        Job job1 = new Job ("Cleaner", 10);
        Job job2 = new Job ("Programmer", 3);
        Job job3 = new Job ("Manager", 1);
        Job job4 = new Job ("YouTuber", 2);
        Job job5 = new Job ("Editor", 3);


    }

}
