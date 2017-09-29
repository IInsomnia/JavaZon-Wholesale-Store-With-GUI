package jjuproject2_javazon;
//@author Johnson


public class LineItem 
{
    private Product jvzProduct;
    private int jvzQuantity;

    public LineItem(Product aProduct, int aQuantity) 
    {
        jvzProduct = aProduct;
        jvzQuantity = aQuantity;
    }

    public Product getJvzProduct() //done
    {
        return jvzProduct;
    }

    public void setJvzProduct(Product jvzProduct) //done
    {
        this.jvzProduct = jvzProduct;
    }

    public int getJvzQuantity() //done
    {
        return jvzQuantity;
    }

    public void setJvzQuantity(int jvzQuantity) //done
    {
        this.jvzQuantity = jvzQuantity;
    }

    public double getJvzLineTotal() //done
    {
        double total = jvzQuantity * jvzProduct.getPrice();

        return total;
    }

    public String getOrderedItem()
    {
        String orderItem = jvzProduct.getDescription();
        
        return orderItem;
    }
}

//@author Johnson
