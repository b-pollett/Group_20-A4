import java.util.*;
import java.util.Scanner;
/**
 * Division class to hold a set of 5 teams and compare their points 
 * to provide a standings.
 *
 * @Bernard Pollett
 * @20201124
 */
public class Division
{
    // instance variables
    private String name;
    private ArrayList<Team> teams;
    private Team t1;
    private Team t2;
    
    /**
     * Constructor for objects of class Division, used mainly to give the
     * Division a name and create array to place teams in.
     */
    public Division(String name)
    {
        // initialise instance variables
        this.name = name;
        this.teams = new ArrayList<Team>();
    }
    
    /**
     * Adds teams to this Divisions ArrayList.
     */
    public void addTeam(Team team)
    {
        if (teams.size() != 5){this.teams.add(team);
        System.out.println(team.getName());}
        else {throw new java.lang.Error("Division is full");}
    }
    
    /**
     * returns name for the division.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Adds match and set points to teams.
     */
    public void addMatch(String t1_name, String t2_name)
    {
        int t1_set = 0;
        int t2_set = 0;
        int game = 1;
        if (t1_name == t2_name){throw new java.lang.Error("Illegal team entered.");}
        //check for the names matching
        this.teams.forEach((temp) -> {
            if (temp.getName() == t1_name) {
                t1 = temp;}
            if (temp.getName() == t2_name) {
                t2 = temp;}});
        if (t1 == null || t2 == null) {throw new java.lang.Error("One of the teams is not part of this Division");}
        else {
            //takes inputs for scores till a match has been settled
            while (t1_set != 3 || t2_set != 3){
                Scanner input = new Scanner(System.in);
                System.out.println("Game " + game + " Team " + t1.getName() + " score: ");
                int score1 = input.nextInt();
                System.out.println("Game " + game + " Team " + t2.getName() + " score: ");
                int score2 = input.nextInt();
                //checks for illegal scoring options
                if (t1_set == 2 && t2_set == 2){
                    if (score1 > 15 || score2 > 15){throw new java.lang.Error("Illegal score");}
                    if (score1 < 15 && score2 < 15){throw new java.lang.Error("Illegal score");}}
                else {
                    if (score1 > 21 || score2 > 21){throw new java.lang.Error("Illegal score");}
                    if (score1 < 21 && score2 < 21){throw new java.lang.Error("Illegal score");}}
                //adds the scores
                if (score1 > score2){
                    t1_set++;
                    t1.addSet();
                    t1.pts_diff += (score1 - score2);
                    game++;
                    //checks for end of match
                    if (t1_set == 3){
                        t1.addSet();
                        System.out.println("Team " + t1.getName() + " wins the match.");
                        break;}}
                if (score1 < score2){
                    t2_set++;
                    t2.addSet();
                    t2.pts_diff += (score2 - score1);
                    game++;
                    if (t2_set == 3){
                        t2.addSet();
                        System.out.println("Team " + t2.getName() + " wins the match.");
                        break;}}
                }
        }
    }
    /**
     * method that calculats standing and prints the standings.
     */
    public void calculateStandings()
    {
       ArrayList<Team> copy = new ArrayList<>(this.teams);
       int i = 1;
       while (i<=5)
       {
           Team maxpts = copy.get(0);
           int j=0;
           for (Team temp: teams)
            if (temp.getPts() > maxpts.getPts())
            {
                this.t1 = temp;
            }
            else if(temp.getPts() == maxpts.getPts())
            {
                if (temp.getDiff() > maxpts.getDiff())
                {
                    this.t1 = temp;
                }
            }
            j++;
           System.out.println(i+"st Place: " + maxpts.getName());
           copy.remove(j-1);
           i++;
       }
       System.out.println("\n");
    }
}
