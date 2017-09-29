package jjuproject2_javazon;
//@author Johnson


public class Validator 
{
    private static String errorMessage = "";

    public static String getOrderID(String anID) 
    {
	//Runs the validation and Add any errors to the error message
        if (anID.length() == 0) 
        {
            errorMessage += "Order ID cannot be blank\n";
        }
        return anID;
    }

    public static String getValidFirstName(String firstName) 
    {
        if(isValidFirstName(firstName) == false)
        {
            errorMessage += ("Please enter a valid First Name. The name " + firstName + " is not valid \n");
        }
        
        return firstName;
    }
    
    //To Validate first name input
    private static boolean isValidFirstName(String firstName) 
    {
        boolean result = true;

        if(firstName.length() < 1)
        {
            result = false;
        }
        else if(firstName.matches("[a-zA-Z]+") != true)
        {
            result = false;
        }
        
        return result;
    }
    
    //Call to Get Valid last name
    public static String getValidLastName(String lastName) 
    {
        if(isValidLastName(lastName) == false)
        {
            errorMessage += ("Please enter a valid Last Name. The name " + lastName + " is not valid \n");
        }
        
        return lastName;
    }

    //To Validate last name input
    private static boolean isValidLastName(String lastName) 
    {
        boolean result = true;

        if(lastName.length() < 1)
        {
            result = false;
        }
        else if(lastName.matches("[a-zA-Z]+") != true)
        {
            result = false;
        }
        
        return result;
    }
    
    //Call to Get Valid street
    public static String getValidStreet(String streetNameNum)
    {
        if(isValidStreet(streetNameNum) == false)
        {
            errorMessage += ("Please enter a valid street address. " + streetNameNum + " is not a valid street \n");
        }
        
        return streetNameNum;
    }
    
    //To Validate street input
    private static boolean isValidStreet(String streetName)
    {
        boolean result = true;
        
        if(streetName.length() < 1)
        {
            result = false;
        }
        else if(streetName.matches("[a-zA-Z0-9 ]+") != true)
        {
            result = false;
        }
        return result;
    }
    
    //Call to Get Valid city
    public static String getValidCity(String cityName)
    {
        if(isValidCity(cityName) == false)
        {
            errorMessage += ("Please enter a valid City Name. " + cityName + " is not a valid City \n");
        }
        return cityName;
    }
    
    //To Validate city input
    private static boolean isValidCity(String cityName)
    {
        boolean result = true;
        if(cityName.length() < 1)
        {
            result = false;
        }
        else if(cityName.matches("[a-zA-Z ]+") != true)
        {
            result = false;
        }
        return result;
    }
    
    //Call to Get Valid state
    public static String getValidState(String stateName)
    {
        if(isValidState(stateName) == false)
        {
            errorMessage += ("Please enter a valid State. " + stateName + " is not a valid state \n");
        }
        return stateName;
    }

    //To Validate state input
    private static boolean isValidState(String stateName)
    {
        boolean result = true;
        if(stateName.length() != 2)
        {
            result = false;
        }
        else if(stateName.matches("[a-zA-Z]+") != true)
        {
            result = false;
        }
        return result;
    }
    
    //Call to Get Valid zipcode
    public static String getValidZip(String zipCode)
    {
        if(isValidZip(zipCode) == false)
        {
            errorMessage += ("Please enter a valid five digit Zipcode. " + zipCode + " is not valid \n");
        }
        return zipCode;
    }
    
    //To Validate zipcode input
    private static boolean isValidZip(String zipCode)
    {
        boolean result = true;
        if(zipCode.length() != 5)
        {
            result = false;
        }
        else if(zipCode.matches("[0-9]+") != true)
        {
            result = false;
        }
        return result;
    }
    
    //Call to Get Valid phone number
    public static String getValidPhone(String phoneNum)
    {
        if(isValidPhone(phoneNum) == false)
        {
            errorMessage += ("Please enter a valid ten digit Phone Number including the area code. " + phoneNum + " is not a valid number \n");
        }
        return phoneNum;
    }
    
    //To Validate phone number input
    private static boolean isValidPhone(String phoneNum)
    {
        boolean result = true;
        if(phoneNum.length() != 10)
        {
            result = false;
        }
        else if(phoneNum.matches("[0-9]+") != true)
        {
            result = false;
        }
        return result;
    }
    
    //Call to Get Valid membership id
    public static String getValidMembership(String membershipID)
    {
        if(isValidMembership(membershipID) == false)
        {
            errorMessage += ("Please enter a valid membership ID consisting of 2 characters followed by 4 numbers. " + membershipID + " is not valid \n");
        }
        return membershipID;
    }
    
    //To Validate membership id input
    private static boolean isValidMembership(String membershipID)
    {
        boolean result = true;
        if(membershipID.length() != 6)
        {
            result = false;
        }
        else if(membershipID.matches("^[a-zA-Z][a-zA-Z][0-9][0-9][0-9][0-9]$") != true)
                {
                    result = false;
                }
        return result;
    }
    
    //Call to Get Valid product quantity
    public static String getValidQuantity(String productQuantity)
    {
        if(isValidQuantity(productQuantity) == false)
        {
            errorMessage += ("Please enter a valid Quantity. " + productQuantity + " is not a valid quantity. \n");
        }
        return productQuantity;
    }
    
    //To Validate product quantity input
    private static boolean isValidQuantity(String productQuantity)
    {
        boolean result = true;
        if(productQuantity.matches("[0-9]+") == true)
        {
            int Quantity = Integer.parseInt(productQuantity);
            if(Quantity >= 1)
            {
                result = true;
            }
            else
            {
                result = false;
            }
        }
        else
        {
            result = false;
        }

        return result;
    }

    //method to return the error message	
    public static String getError() 
    {
        return errorMessage;
    }

    //method to clear the error message
    public static void clearError() 
    {
        errorMessage = "";
    }
}

//@author Johnson
