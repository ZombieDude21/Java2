public class Team {
    private String name;
    private int won;
    private int lost;
    private int drawn;
    private int scored;
    private int letin;
    private int diffrence;
    private int points;
    private int played;

    public Team (String name){
        this.name = name;

    }

    public int getPlayed() {
        played = won + drawn + lost;
        return played;
    }

    public void setScore(int won, int drawn, int lost){
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;

    }
    public void playMatch(int tempScored, int tempLetin)
    {
        this.scored = scored + tempScored;
        this.letin = letin + tempLetin;

    }

    public String getScore(){
        return name +  " " + getPlayed() +  " " + won +  " " +  drawn +  " " + lost +  " " + scored +  " " + letin +  " " + getDiffrence() +  " " + getPoints();
    }

    public int getDiffrence() {
        diffrence = scored - letin;
        return diffrence;
    }

    public int getPoints() {
        points = (won * 2) + drawn;
        return points;
    }

    public static void main(String[] args) {
        Team hudds = new Team ("huddersfield");
        hudds.setScore(2, 1, 2);
        hudds.playMatch(12, 22);
        hudds.playMatch(12, 22);
        System.out.println(hudds.getScore());
    }
}

