
/**
 * Team class, used to hold name of team and different points
 * from matches.
 *
 * @Bernard Pollett
 * @v20201124
 */
public class Team
{
    // instance variables
    private String name;
    private int PLAY;
    private int COACH;
    public int set_pts;
    public int pts_diff;
   
    /**
     * Constructor for objects of class Team
     * sets name, players, coaches, set_pts, and pts_diff.
     */
    public Team(String name)
    {
        // initialise instance variables
        this.name = name;
        this.PLAY = 12;
        this.COACH = 2;
        this.set_pts = 0;
        this.pts_diff = 0;
    }
    
    /**
     * Method to pull the teams name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method to pull the teams points from matches and sets.
     */
    public int getPts()
    {
        return set_pts;
    }
    
    /**
     * Method to pull the teams total points difference from games.
     */
    public int getDiff()
    {
        return pts_diff;
    }
    
    /**
     * Method to add points to the set scores for standings.
     */
    public void addSet()
    {
        this.set_pts++;
    }
    
    /**
     * Method to pull the teams name
     */
    public String ShowInfo()
    {
        return "Team Name: " + name + 
        "\nNumber of Players: " + PLAY +
        "\nNumber of Coaches: " + COACH;
    }
}
