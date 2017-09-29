package jjuproject2_javazon;
//@author Johnson

import java.text.NumberFormat;
import java.util.ArrayList;


public class Order 
{
    //class variables
    private String orderID;
    private Customer orderCustomer;
    private Clerk orderClerk;
    private ArrayList<LineItem> lineItems;

    //store totals
    double subtotal;
    double tax;
    double total;

    //constant defining tax
    private static double TAX_RATE = 0.0825;

    private int productCount;

    public Order(String anID) 
    {
        lineItems = new ArrayList<LineItem>();

        orderID = anID;
        subtotal = 0;
        tax = 0;
        total = 0;
    }

    public void setOrderID(String anID) 
    {
        orderID = anID;
    }

    public void setOrderCustomer(Customer aCustomer) 
    {
        orderCustomer = aCustomer;
    }

    public void setOrderClerk(Clerk aClerk) 
    {
        orderClerk = aClerk;
    }

    public void setOrderProduct(Product aProduct, int aQty) 
    {
        productCount++;
        LineItem lineItem = new LineItem(aProduct, aQty);
	lineItems.add(lineItem);
    }

    public String getOrderID() 
    {
        return orderID;
    }

    public void calcSubtotal()
    {
        for(int i=0; i < lineItems.size(); i++)
        {
            subtotal += lineItems.get(i).getJvzLineTotal();
        }
    }

    public void calcTax() 
    {
        tax = subtotal * TAX_RATE;
    }

    public void calcTotal() 
    {
        total = subtotal + tax;
    }

    public String toString() 
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        String result = "";

        result += "CASHIER @ REGISTER\n " + orderClerk.getFirstName() + " " + orderClerk.getLastName() + " @ " + orderClerk.getRegisterNbr() + "\n\n";

        result += "Order # " + orderID + "\n\n";

        result += "CUSTOMER INFO\n" + orderCustomer.toString() + "";

        result += "\nNUMBER OF ITEMS SOLD = " + getNumberItemsSold() + "\n\n";

        for (LineItem li : lineItems) {
            result += li.getJvzQuantity() + "  @  " + nf.format(li.getJvzProduct().getPrice()) + " = " + nf.format(li.getJvzQuantity() * li.getJvzProduct().getPrice()) + "\n";
            result += "    " + li.getJvzProduct().getDescription() + "\n\n";
        }

        result += "TOTALS\n";
        result += "Subtotal: " + nf.format(subtotal) + "\n";
        result += "Tax: " + nf.format(tax) + "\n";
        result += "Total: " + nf.format(total);

        return result;
    }

    //Returns the number of items sold
    public int getNumberItemsSold() 
    {
        int totalQty = 0;
        for (LineItem li : lineItems) 
        {
            totalQty += li.getJvzQuantity();
        }
        return totalQty;
    }

    public double getTotal() 
    {
        return total;
    }

    public Customer getCustomer() 
    {
        return orderCustomer;
    }

    public double getLineTotal(int iLine) 
    {
        //Select the LineItem from the ArrayList
        LineItem selectedItem = lineItems.get(iLine);

        //Get the total for that item
        return selectedItem.getJvzLineTotal();
    }
    
    public String getOrderItem(int item)
    {
        String orderItem;
        LineItem selectedItem = lineItems.get(item);
        orderItem = selectedItem.getOrderedItem();
        
        return orderItem;
    }

    public String qtySold(int qty)
    {
        String itemQty = "";
        LineItem selectedItem = lineItems.get(qty);
        itemQty = Integer.toString(selectedItem.getJvzQuantity());
     
        return itemQty;
    }
}

//@author Johnson

