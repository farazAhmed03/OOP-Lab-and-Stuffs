public class OWNER {
    private String ownerName, personalID;

//  Constructor
    public OWNER(String ownerName, String personalID) {
        setOwnerName(ownerName);
        setPersonalID(personalID);
    }

//  Setters
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setPersonalID(String personalID) { this.personalID = personalID; }

//  Getters
    public String getOwnerName() { return ownerName; }
    public String getPersonalID() { return personalID; }


//  toString() Method
    public String toString() {
        return "\nOwner Name : " + ownerName + "\nPersonalID : " + personalID + "\n";
    }


}
