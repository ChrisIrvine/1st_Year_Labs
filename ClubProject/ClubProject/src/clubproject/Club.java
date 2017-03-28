package clubproject;
import java.util.ArrayList;
/**
 * A class to store details of club memberships.
 * 
 */
public class Club
{
   ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();
    }
    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }
    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
     * Determine the number of members who joined in the given month
     * 
     * @param Month     The month we are interested in.
     * @return          The number of members.
     */
    public int joinedInMonth(int Month)
    {
        int memberJoined = 0;
        
        if (Month < 0 || Month <= 12)
        {
            for (Membership member: members)
            {
                if (member.getMonth() == Month)
                {
                    memberJoined++;
                }
            }
            return memberJoined;
        }
        return -1;
    }
    
    @Override
    public String toString() 
    {
        String newLine = System.getProperty( "line.separator" );
        StringBuilder builder = new StringBuilder();
        
        for (Membership member: members)
        {
            builder.append(member);
            builder.append(newLine);
        }
        
        return builder.toString();
    }
    
    public Membership[] getMembers ()
    {
        return (Membership[]) members.toArray();
    }
}
