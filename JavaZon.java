package jjuproject2_javazon;
//@author Johnson

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;


public class JavaZon 
{
    private ArrayList <Clerk> clerksList;			//Arraylist to hold all the clerks
    private HashMap <String,Order> jvzOrder;		//Hashmap to hold orders the key pair value consists of (OrderID, Order Object)

    public JavaZon()
    {
        //initialize the Clerk
        clerksList = new ArrayList<Clerk>();
        //initialize the orders
        jvzOrder = new HashMap<String,Order>();
        //load clerks
        loadClerkList();
    }

    public void addOrder(Order anOrder)
    {
        //Uses jvzOrder object to add new order to the hashmap
        jvzOrder.put(anOrder.getOrderID(), anOrder);
    }

    public void processOrder(String anID)
    {
        Order selectedOrder = jvzOrder.get(anID);
        selectedOrder.calcSubtotal();
        selectedOrder.calcTax();
        selectedOrder.calcTotal();
    }

    public void loadClerkList()
    {
        Clerk musicClerk = new Clerk("EMP100",1, "Homer", "Simpson","243 North Main", "Spingfield", "CA", "98765", "909-987-6666");
        Clerk bookClerk = new Clerk("EMP200", 2,"Bart", "Simpson","454 North Euclid", "Spingfield", "CA", "98765", "909-987-4444");
        Clerk gameClerk = new Clerk("EMP300",3, "Lisa", "Simpson","767 North Holt", "Spingfield", "CA", "98765", "909-987-3333");

        clerksList.add(musicClerk);
        clerksList.add(bookClerk);
        clerksList.add(gameClerk);
    }

    public void setClerk(String anID)
    {
        Random rand = new Random();
        int i = rand.nextInt(3);

        Order selectedOrder = jvzOrder.get(anID);
        selectedOrder.setOrderClerk(clerksList.get(i));
    }

    public String getReceipt(String anID)
    {
        String result;

        Order selectedOrder = jvzOrder.get(anID);

        result = "JAVAZON WHOLESALE STORE\n\n";

        result += "90404 CENTRAL AVE\n";
        result += "MONTCLAIR, CA, 91763\n";
        result += "  (909)345-9876\n\n";

        result += selectedOrder.toString();

        return result;
    }

    public String getOrdersSummary() //done
    {
        String result = "";
        Order selectedOrder;
        Customer selectedCustomer;

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String orderID = "";
        String firstName = ""; 
        String lastName = "";
        double orderTotal = 0;
        
        //Loops through the jvzOrder Hashmap to retrieve Order Customer information
        //And stores it into selectedOrder Object
        //Result returns a summary of all the orders in the Hashmap
        if(jvzOrder.size() != 0)
        {
            for(String anOrder : jvzOrder.keySet()) 
            {
                //Get Order Information
                selectedOrder = jvzOrder.get(anOrder);
                orderID = selectedOrder.getOrderID();
                orderTotal = selectedOrder.getTotal();
                //Get Customer Information
                selectedCustomer = selectedOrder.getCustomer();
                firstName = selectedCustomer.getFirstName();
                lastName = selectedCustomer.getLastName();

                result += "Order ID: " + orderID + ", Customer Name: " + firstName + " " + lastName 
                    + ", Order Total: " + nf.format(orderTotal) + "\n";
            }
        }
        return result;
    }

    public String deleteOrder(String anID)
    {
        String result = "";

        //Loops through jvzOrder to find the given orderID to see if there is a match
        //Then deletes the orderID if true
        for (int i = 0; i < jvzOrder.size(); i++)
        {
            if(jvzOrder.containsKey(anID))
            {
                jvzOrder.remove(anID);
                result = "The Order ID " + anID + " has been deleted";	
            }
            else
            {
                result = "The Order ID " + anID + " was not found";
            }
        }
            return result;
    }

    public Order findOrder(String anID)
    {
        String result = "";
        Order selectedOrder = null;

        //Checks if the HashMap contains the order
        //If it does then store the order in selectedOrder and return selectedOrder
        //If the order is not found then return a null

        for (int i = 0; i < jvzOrder.size(); i++)
        {
            if(jvzOrder.containsKey(anID))
            {
                selectedOrder = jvzOrder.getOrDefault(anID, selectedOrder);
                result = "The Order ID " + anID + " was found";	
            }
            else
            {
                selectedOrder = null;
                result = "The Order ID " + anID + " was not found";
            }
        }
        return selectedOrder;
    }

    public void clearOrders()
    {
        //Clear the hashmap of all orders
        jvzOrder.clear();
    }
}

//@author Johnson
