import java.util.*;
/**
 * @author Mehul Kapoor
 * @version  25-11-2020
 */

//class governing the league
public class main{
    private ArrayList<Division> divlist;
    private Division div1;
    public main()
    {
        this.divlist = new ArrayList<Division>();
    }   
    private void addDivision(Division div)
    {
        this.divlist.add(div);
    }
    public void leagueSetup()  //adds teams to divisions based on default names.
    {
        int i = 1;
        while (i<=3)
        {
            
            String x = i + "";
            Division divi = new Division("div"+x);
            int j = 1;
            while (j<=5)
            {
                System.out.println(j);
                String y = j + "";
                Team team = new Team("team"+y);
                divi.addTeam(team);
                j = j + 1;
            }
            this.divlist.add(divi);
            i++;
        }
    }
    void match(String divname, String team1, String team2)                  //a match takes place.
    {
        Iterator<Division> iter = this.divlist.iterator(); 
        while(iter.hasNext())
        {
            Division p = iter.next();
            if (divname == p.getName())
            {
                this.div1 = p;
            }
        }
        this.div1.addMatch(team1, team2);
        this.div1.calculateStandings();
    }
    void displayinfo()                 //to display status of league so far.
    {
        for(Division div: this.divlist)
        {
            System.out.println("Division: "+div.getName());
            div.calculateStandings();       
        }
    }

}
