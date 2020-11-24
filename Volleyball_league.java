/**
 * @author Hayal Desta
 * @version  24-11-2020
 */

//Involves the concept of nested class and hashmap.

class Volleyball_league {
int num;
String divisions[];
  // inner class
private class Teams {
String tname;
String players[];
String coaches[];

public void get_team_details() {
//Function to get the details of each class from the user
}
public void put_team_details() {
//Function to put the details of each class from the user
}
}

public void get_Divisions_details() {

// function to add the name of 3 divisions to the member divisions[]

}
public void put_Divisions_details() {

// function to add the name of 3 divisions to the member divisions[]

}
Teams tobj[];
Hashmap<String,Teams[]> h1=new Hashmap<String,Teams[] >();
   public void add_team(Teams obj, String dn) {
if(h1.get(dn).length<5){
tobj= h1.get(dn);
tobj[tobj.length]=obj;
h1.put(dn,tobj);}
}

void leagueSetup(required_division_passed) {
// create team
Teams t1 = new Teams();
t1.get_team_details();
t1.put_team_details
// show division
put_Divisions_details()

//link team to division
add_team(t1,required_division_passed);

}

}

public class MyClass {

public static void main(String args[]) {
// Instantiating the outer class
Volleyball_league outer = new Volleyball_league ();
  
// to add dividions can be looped 3
outer.get_Divisions_details();

outer.put_Divisions_details();

// to add a tem and link to a division

outer.leagueSetup(required_division_passed)


}
}
