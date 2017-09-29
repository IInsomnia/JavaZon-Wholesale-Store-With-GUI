package jjuproject2_javazon;
//@author Johnson
 

public class Customer extends Person 
{
    String memberShipID; 

    public Customer(String firstName, String lastName, String anAddress, String city, 
                    String state, String zip, String phone, String aMemberShipID) 
    {
        super(firstName, lastName, anAddress, city, state, zip, phone);
        memberShipID = aMemberShipID;
    }

    public String toString()
    {
        String result="";

        result += "Member ID: " + memberShipID + "\n";
        result += super.toString();

        return result;
    }
}
