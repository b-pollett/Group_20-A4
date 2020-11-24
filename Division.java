import java.util.ArrayList;
/**
 * Division class to hold a set of 5 teams and compare their points 
 * to provide a standings.
 *
 * @Bernard Pollett
 * @20201124
 */
public class Division
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Team> teams;
    
    /**
     * Constructor for objects of class Division, used mainly to give the
     * Division a name and create array to place teams in.
     */
    public Division(String name)
    {
        // initialise instance variables
        this.name = name;
        this.teams = new ArrayList<>();
    }
    
    /**
     * Method to add teams to the divisions ArrayList
     */
    public void addTeam(Team team)
    {
        if (teams.size() != 5){this.teams.add(team);}
        else {throw new java.lang.Error("Division is full");}
    }
}
