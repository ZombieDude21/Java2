public class Job {
    private String name;
    private int priotity;
    private boolean complete;

    public Job(String name, int priority)
    {
        this.name = name;
        this.priotity = priority;
        this.complete = false;

    }

    public String GetInfo()
    {
        return name + " " + priotity + " " + complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    public boolean isComplete()
    {
        if (complete == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
