public class  Member {

    private String name;
    private int contribution;

    public Member (String name) {
        this.name = name;
        this.contribution = 0;
    }

    public Member (String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getContribution () {
        return contribution;
    }

    public void setContribution (int contribution) {
        this.contribution = contribution;
    }

    public boolean contribute (int amount) {
        if (amount > 0) {
            this.contribution += amount;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString () {
        return "Member: " + this.getName () + ". Contribution: " + this.getContribution () + '.';
    }

    public static void main (String[] args) {


        Member gary = new Member ("gary", 27);
        Member tony = new Member ("tony", 21);
        Member rubiya= new Member ("rubiya", 20);
        Member steve = new Member ("steve", 28);

        System.out.println(gary.toString());
        System.out.println(tony.toString());
        System.out.println(rubiya.toString());
        System.out.println(steve.toString());
        int total = ( gary.getContribution() + tony.getContribution() + rubiya.getContribution() + steve.getContribution());
        System.out.println("Total contribution " + total);
        int turkey = (total / 20);
        System.out.println("number to turkeys you can buy " + turkey);


    }



}

