import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */

public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        //question 3
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        //queston 2
        return members.size();
    }
    
    public int numberOfMembersJoined(int month) {
        //question 3
        if (month < 1 || month > 12) {
            System.out.println("Invalid range");
            return 0;
        }
        else {
        int count = 0;
        for(Membership m : members) {
            if (m.getMonth() == month) {
                count++;
            }
        }
         return count;
        }
    }
    
    /**
    Remove from the club's collection all members who
    joined in the given month, and return them stored
    in a separate collection object.
    @param month The month of the membership.
    @param year The year of the membership.
    @return The members who joined in the given month and years
    */
    public ArrayList<Membership> purge(int month, int year) {
        ArrayList<Membership> purgeList = new ArrayList<>();
        if (month < 1 || month > 12) {
            System.out.println("invalid range");
            return null;
        }
        else {
            Iterator<Membership> it = members.iterator();
            while(it.hasNext()) {
                Membership purge = it.next();
                if(purge.getMonth() == month && purge.getYear() == year){
                    purgeList.add(purge);
                    it.remove();
                }
            }
        }
        return purgeList;
    }
}