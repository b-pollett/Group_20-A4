
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String name;
    private int PLAY;
    private int COACH;
    private int set_pts;
    private int pts_diff;
   
    /**
     * Constructor for objects of class Team
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
}
