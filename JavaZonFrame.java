package jjuproject2_javazon;
//@author Johnson

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.text.*;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;


public class JavaZonFrame extends javax.swing.JFrame implements ActionListener, ItemListener {

    private JPanel jPanel1;
    private JButton btnAdd;
    private JComboBox cboItem1, cboItem2, cboItem3;
    private JTextField txtQty1, txtQty2, txtQty3;
    private JTextField txtPrice1, txtPrice2, txtPrice3;
    private JTextField txtLineTotal3, txtLineTotal2, txtLineTotal1;
    private JLabel jLabel14, jLabel12, jLabel11, jLabel10, jLabel2;
    private JLabel jLabel3, jLabel4, jLabel5, jLabel9;
    private JLabel jLabel8, jLabel7, jLabel6, jLabel1, jLabel13;
    private JTextField txtOrderID, txtFirstName, txtLastName, txtPhone, txtMemberShip;
    private JButton btnReset;
    private JLabel jLabel15;
    private JButton btnImport;
    private JTextField txtStreet, txtCity, txtState, txtZip;
    private JTextField txtTotal;
    private JTextField txtTax;
    private JTextField txtSubtotal;
    private JLabel lblLineTotal;
    private JLabel lblTotal;
    private JLabel lblTax;
    private JLabel lblSubtotal;
    private JButton btnExport;
    private JButton btnClear;
    private JButton btnList;
    private JButton btnFind;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JLabel jLabel16, jLabel17;
    
    private JavaZon jz;
    private Menu menu;
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    String orderID;
    
    public JavaZonFrame() 
    {
        try 
        {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            GridLayout thisLayout = new GridLayout();

            jz = new JavaZon();
            menu = new Menu();

            String menuItems[] = menu.getMenuDescriptions();

            getContentPane().setLayout(thisLayout);

            jPanel1 = new JPanel();
            getContentPane().add(jPanel1);
            GridBagLayout jPanel1Layout = new GridBagLayout();

            jPanel1.setLayout(jPanel1Layout);
            jPanel1.setPreferredSize(new java.awt.Dimension(500, 425));

            jLabel1 = new JLabel();
            jPanel1.add(jLabel1, gc(2, 0, 1, 3));
            jLabel1.setText("Welcome to JAVAZON III");
            
            jLabel2 = new JLabel();
            jPanel1.add(jLabel2, gc(1, 2, 1, 1));
            jLabel2.setText("Order ID:");
            
            txtOrderID = new JTextField(10);
            jPanel1.add(txtOrderID, gc(2, 2, 1, 1));

            jLabel3 = new JLabel();
            jPanel1.add(jLabel3, gc(1, 3, 1, 1));
            jLabel3.setText("First Name:");
            
            txtFirstName = new JTextField(10);
            jPanel1.add(txtFirstName, gc(2, 3, 1, 2));

            jLabel4 = new JLabel();
            jPanel1.add(jLabel4, gc(4, 3, 1, 1));
            jLabel4.setText("Last Name:");

            txtLastName = new JTextField(10);
            jPanel1.add(txtLastName, gc(5, 3, 1, 2));

            jLabel5 = new JLabel();
            jPanel1.add(jLabel5, gc(1, 5, 1, 1));
            jLabel5.setText("Membership ID:");

            txtMemberShip = new JTextField(10);
            jPanel1.add(txtMemberShip, gc(2, 5, 1, 1));
            
            jLabel6 = new JLabel();
            jPanel1.add(jLabel6, gc(4, 5, 1, 1));
            jLabel6.setText("Phone:");
            
            txtPhone = new JTextField(10);
            jPanel1.add(txtPhone, gc(5, 5, 1, 2));
            
            jLabel7 = new JLabel();
            jPanel1.add(jLabel7, gc(1, 6, 1, 1));
            jLabel7.setText("Street:");
            
            txtStreet = new JTextField(10);
            jPanel1.add(txtStreet, gc(2, 6, 1, 2));
            
            jLabel8 = new JLabel();
            jPanel1.add(jLabel8, gc(1, 7, 1, 1));
            jLabel8.setText("City:");
            
            txtCity = new JTextField(10);
            jPanel1.add(txtCity, gc(2, 7, 1, 1));
            
            jLabel9 = new JLabel();
            jPanel1.add(jLabel9, gc(3, 7, 1, 1));
            jLabel9.setText("State:");
            
            txtState = new JTextField(10);
            jPanel1.add(txtState, gc(4, 7, 1, 1));
            
            jLabel10 = new JLabel();
            jPanel1.add(jLabel10, gc(5, 7, 1, 1));
            jLabel10.setText("Zip:");
            
            txtZip = new JTextField(10);
            jPanel1.add(txtZip, gc(6, 7, 1, 1));
            
            jLabel11 = new JLabel();
            jPanel1.add(jLabel11, gc(2, 8, 1, 1));
            jLabel11.setText("Product:");
            
            cboItem1 = new JComboBox();
            jPanel1.add(cboItem1, gc(2, 9, 1, 1));
            for(int i = 0; i < menuItems.length; i++)
            {
                cboItem1.addItem(menuItems[i]);
            }
            cboItem1.setSelectedIndex(-1);
            cboItem1.addItemListener(this);
            
            cboItem2 = new JComboBox();
            jPanel1.add(cboItem2, gc(2, 10, 1, 1));
            for(int i = 0; i < menuItems.length; i++)
            {
                cboItem2.addItem(menuItems[i]);
            }
            cboItem2.setSelectedIndex(-1);
            cboItem2.addItemListener(this);
            
            cboItem3 = new JComboBox();
            jPanel1.add(cboItem3, gc(2, 11, 1, 1));
            for(int i = 0; i < menuItems.length; i++)
            {
                cboItem3.addItem(menuItems[i]);
            }
            cboItem3.setSelectedIndex(-1);
            cboItem3.addItemListener(this);
            
            jLabel12 = new JLabel();
            jPanel1.add(jLabel12, gc(3, 8, 1, 1));
            jLabel12.setText("Quantity:");
            
            txtQty1 = new JTextField(10);
            jPanel1.add(txtQty1, gc(3, 9, 1, 1));
            txtQty1.addActionListener(this);
            
            txtQty2 = new JTextField(10);
            jPanel1.add(txtQty2, gc(3, 10, 1, 1));
            txtQty2.addActionListener(this);
            
            txtQty3 = new JTextField(10);
            jPanel1.add(txtQty3, gc(3, 11, 1, 1));
            txtQty3.addActionListener(this);
            
            jLabel13 = new JLabel();
            jPanel1.add(jLabel13, gc(4, 8, 1, 1));
            jLabel13.setText("Price:");
            
            txtPrice1 = new JTextField(10);
            jPanel1.add(txtPrice1, gc(4, 9, 1, 1));
            
            txtPrice2 = new JTextField(10);
            jPanel1.add(txtPrice2, gc(4, 10, 1, 1));
            
            txtPrice3 = new JTextField(10);
            jPanel1.add(txtPrice3, gc(4, 11, 1, 1));
            
            jLabel14 = new JLabel();
            jPanel1.add(jLabel14, gc(5, 8, 1, 1));
            jLabel14.setText("LineTotal:");
            
            txtLineTotal1 = new JTextField(10);
            jPanel1.add(txtLineTotal1, gc(5, 9, 1, 1));
            
            txtLineTotal2 = new JTextField(10);
            jPanel1.add(txtLineTotal2, gc(5, 10, 1, 1));
            
            txtLineTotal3 = new JTextField(10);
            jPanel1.add(txtLineTotal3, gc(5, 11, 1, 1));
            
            jLabel15 = new JLabel();
            jPanel1.add(jLabel15, gc(4, 12, 1, 1));
            jLabel15.setText("Subtotal:");
            
            txtSubtotal = new JTextField(10);
            jPanel1.add(txtSubtotal, gc(5, 12, 1, 1));
            
            jLabel16 = new JLabel();
            jPanel1.add(jLabel16, gc(4, 13, 1, 1));
            jLabel16.setText("Tax:");
            
            txtTax = new JTextField(10);
            jPanel1.add(txtTax, gc(5, 13, 1, 1));
            
            jLabel17 = new JLabel();
            jPanel1.add(jLabel17, gc(4, 14, 1, 1));
            jLabel17.setText("Total:");
            
            txtTotal = new JTextField(10);
            jPanel1.add(txtTotal, gc(5, 14, 1, 1));
            
            btnAdd = new JButton();
            jPanel1.add(btnAdd, gc(1, 17, 1, 1));
            btnAdd.setText("Add");
            btnAdd.addActionListener(this);

            btnDelete = new JButton();
            jPanel1.add(btnDelete, gc(2, 17, 1, 1));
            btnDelete.setText("Delete");
            btnDelete.addActionListener(this);

            btnFind = new JButton();
            jPanel1.add(btnFind, gc(3, 17, 1, 1));
            btnFind.setText("Find");
            btnFind.addActionListener(this);

            btnList = new JButton();
            jPanel1.add(btnList, gc(4, 17, 1, 1));
            btnList.setText("List");
            btnList.addActionListener(this);

            btnClear = new JButton();
            jPanel1.add(btnClear, gc(5, 17, 1, 1));
            btnClear.setText("Clear");
            btnClear.addActionListener(this);

            btnReset = new JButton();
            jPanel1.add(btnReset, gc(6, 17, 1, 1));
            btnReset.setText("Reset");
            btnReset.addActionListener(this);
            
            btnUpdate = new JButton();
            jPanel1.add(btnUpdate, gc(7, 17, 1, 1));
            btnUpdate.setText("Update");
            btnUpdate.addActionListener(this);
            
            jLabel5 = new JLabel();
            jPanel1.add(jLabel5, gc(3, 18, 1, 1));
            jLabel5.setText("File Options");
            
            btnImport = new JButton();
            jPanel1.add(btnImport, gc(4, 18, 1, 1));
            btnImport.setText("Import");
            btnImport.addActionListener(this);
            
            btnExport = new JButton();
            jPanel1.add(btnExport, gc(5, 18, 1, 1));
            btnExport.setText("Export");
            btnExport.addActionListener(this);
            
            pack();
            this.setSize(650, 555);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    private GridBagConstraints gc(int x, int y, int h, int w) 
    {
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = x;
        c.gridy = y;
        c.gridheight = h;
        c.gridwidth = w;

        c.anchor = GridBagConstraints.WEST;

        c.fill = GridBagConstraints.HORIZONTAL;

        c.insets = new Insets(5, 5, 5, 5);

        return c;
    }

    //Action Triggered when Button is clicked
    public void actionPerformed(ActionEvent e) 
    {
        //Call addOrder
        if (e.getSource() == btnAdd)
        {
            addOrder();
        }
        //Call deleteOrder
        else if (e.getSource() == btnDelete)
        {
            deleteOrder();
        }
        //Call findOrder
        else if (e.getSource() == btnFind)
        {
            findOrder();
        }
        //call printOrders
        else if (e.getSource() == btnList)
        {
            printOrders();
        }
        //Call clearOrders
        else if (e.getSource() == btnClear)
        {
            clearOrders();
        }
        //call resetForm
        else if (e.getSource() == btnReset)
        {
            resetForm();
        }
        else if (e.getSource() == btnUpdate)
        {
            updateOrder();
        }
        else if (e.getSource() == btnImport)
        {
            importOrders();
        }
        else if (e.getSource() == btnExport)
        {
            exportOrders();
        }
    }

    public void itemStateChanged(ItemEvent e) //done?
    {
        //Displays Item Price based on what is selected
        Object o = e.getSource();
        if (o == cboItem1) 
        {
            if (cboItem1.getSelectedIndex() != -1) 
            {
                txtPrice1.setText(menu.getPrice(cboItem1.getSelectedIndex()));
            }
            if (cboItem1.getSelectedIndex() == 0)
            {
                txtQty1.setText(menu.getPrice(cboItem1.getSelectedIndex()));
            }
        }
        
        if (o == cboItem2) 
        {
            if (cboItem2.getSelectedIndex() != -1) 
            {
                txtPrice2.setText(menu.getPrice(cboItem2.getSelectedIndex()));
            }
            if (cboItem2.getSelectedIndex() == 0)
            {
                txtQty2.setText(menu.getPrice(cboItem2.getSelectedIndex()));
            }
        }
        
        if (o == cboItem3) 
        {
            if (cboItem3.getSelectedIndex() != -1) 
            {
                txtPrice3.setText(menu.getPrice(cboItem3.getSelectedIndex()));
            }
            if (cboItem3.getSelectedIndex() == 0)
            {
                txtQty3.setText(menu.getPrice(cboItem3.getSelectedIndex()));
            }
        }
    }
    
    //Adds a New Order
    //Checks if an existing orderID before executing
    private void addOrder()
    {
        String anOrderID = txtOrderID.getText();
        if(jz.findOrder(anOrderID) == null)
        {
            orderFunction();
            if(Validator.getError().length() != 0)
            {
                JOptionPane.showMessageDialog(null, "The Order was not saved");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Order " + orderID + " was Saved");
                resetForm();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The Order ID you are trying to add already exists, please choose another ID");
        }
    }
        //Updates an existing Order
        //Checks if the orderID exists, if it exist then Update is possible
        //Otherwise if the orderID does not exist, it will not update
    public void updateOrder()
    {
        String anOrderID = txtOrderID.getText();
        if(jz.findOrder(anOrderID) != null)
        {
            orderFunction();
            if(Validator.getError().length() != 0)
            {
                JOptionPane.showMessageDialog(null, "The Order was not updated");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Order " + orderID + " has been Updated");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The Order you are trying to update does not exist");
        }
    }
    
    //Order Adding or Updating Function
    private void orderFunction()
    {
        //Before we start processing, We clear any errors
        Validator.clearError(); 

        //Validating Inputs
        orderID = Validator.getOrderID(txtOrderID.getText());
        String firstName = Validator.getValidFirstName(txtFirstName.getText());
        String lastName = Validator.getValidLastName(txtLastName.getText());
        String street = Validator.getValidStreet(txtStreet.getText());
        String city = Validator.getValidCity(txtCity.getText());
        String zip = Validator.getValidZip(txtZip.getText());
        String state = Validator.getValidState(txtState.getText());
        String phone = Validator.getValidPhone(txtPhone.getText());
        String membership = Validator.getValidMembership(txtMemberShip.getText());

        //Validating Combox Selection Product Quantity
        if (this.cboItem1.getSelectedIndex() != -1) 
        {
            Validator.getValidQuantity(txtQty1.getText());
        }
        
        if (this.cboItem2.getSelectedIndex() != -1) 
        {
            Validator.getValidQuantity(txtQty2.getText());
        }
        
        if (this.cboItem3.getSelectedIndex() != -1) 
        {
            Validator.getValidQuantity(txtQty3.getText());
        }	        
        
        //if there are errors then display them to the user
        //otherwise start creating the objects for the order
        if (Validator.getError().length() != 0) 
        {
            JOptionPane.showMessageDialog(null, "An Error Occured:\n\n" + Validator.getError());
        } 
        else 
        {
            Customer customer = new Customer(firstName, lastName, street, city,
                                             state, zip, phone, membership);

            Order order = new Order(orderID);
            order.setOrderCustomer(customer);
            
            if (this.cboItem1.getSelectedIndex() != -1) 
            {
                Product product1 = menu.getMenu()[this.cboItem1.getSelectedIndex()];
                order.setOrderProduct(product1, Integer.parseInt(txtQty1.getText()));
                this.txtLineTotal1.setText(nf.format(order.getLineTotal(0)));
            }
            
            if (this.cboItem2.getSelectedIndex() != -1) 
            {
                Product product2 = menu.getMenu()[this.cboItem2.getSelectedIndex()];
                order.setOrderProduct(product2, Integer.parseInt(txtQty2.getText()));
                this.txtLineTotal2.setText(nf.format(order.getLineTotal(1)));
            }
            
            if (this.cboItem3.getSelectedIndex() != -1) 
            {
                Product product3 = menu.getMenu()[this.cboItem3.getSelectedIndex()];
                order.setOrderProduct(product3, Integer.parseInt(txtQty3.getText()));
                this.txtLineTotal3.setText(nf.format(order.getLineTotal(2)));
            }

            jz.addOrder(order);
            jz.setClerk(orderID);
            jz.processOrder(orderID);
            //JOptionPane Receipt Summary
            //JOptionPane.showMessageDialog(null, jz.getReceipt(orderID));
            
            //Returns Subtotal, Tax, and Total price of Ordered Items
            txtSubtotal.setText(nf.format(order.subtotal));
            txtTax.setText(nf.format(order.tax));
            txtTotal.setText(nf.format(order.total));
        }
    }

    //Deletes the Order ID inputted if it exists
    private void deleteOrder()
    {
        String orderID = JOptionPane.showInputDialog("Enter Order ID to Delete");
        if(jz.findOrder(orderID) == null )
        {
            JOptionPane.showMessageDialog(null, "Invalid Order ID");
        }
        else
        {
            jz.deleteOrder(orderID);
            JOptionPane.showMessageDialog(null, "Order has been Deleted");
            resetForm();
        }
    }

    private void findOrder() //done
    {
            //Finds an Existing Order
        String orderID = JOptionPane.showInputDialog("Enter Order ID to Find an Order");

            //TODO
        //Fill the screen with the order that was retrieved
        //All the fields should be blanked out and filled with the values from the new order
        Order findOrder = jz.findOrder(orderID);
        
        if (findOrder != null) 
        {
            resetForm();
            Customer foundCustomer = findOrder.getCustomer();

            txtOrderID.setText(findOrder.getOrderID());
            txtFirstName.setText(foundCustomer.getFirstName());
            txtLastName.setText(foundCustomer.getLastName());
            txtStreet.setText(foundCustomer.getAddress());
            String city = txtCity.getText();
            String state = txtState.getText();
            String zip = txtZip.getText();
            String phone = txtPhone.getText();
            String membership = txtMemberShip.getText();
            
            txtCity.setText(foundCustomer.getCity());
            txtState.setText(foundCustomer.getState());
            txtZip.setText(foundCustomer.getZip());
            txtPhone.setText(foundCustomer.getPhone());
            txtSubtotal.setText(nf.format(findOrder.subtotal));
            txtTotal.setText(nf.format(findOrder.total));
            txtTax.setText(nf.format(findOrder.tax));
            txtMemberShip.setText(foundCustomer.memberShipID);
            
            //Sets ComboBoxes to Product Item if any
            try
            {
            cboItem1.setSelectedItem(findOrder.getOrderItem(0));
            cboItem2.setSelectedItem(findOrder.getOrderItem(1));
            cboItem3.setSelectedItem(findOrder.getOrderItem(2));
            }
            catch(Exception e)
            {
                //ignore any errors
            }
            
            if(cboItem1.getSelectedIndex() != -1)
            {
                txtQty1.setText(findOrder.qtySold(0));
                txtLineTotal1.setText(nf.format(findOrder.getLineTotal(0)));	
            }
            
            if(cboItem2.getSelectedIndex() != -1)
            {
               txtQty2.setText(findOrder.qtySold(1));
               txtLineTotal2.setText(nf.format(findOrder.getLineTotal(1))); 
            }
            
            
            if(cboItem3.getSelectedIndex() != -1)
            {
                txtQty3.setText(findOrder.qtySold(2));
                txtLineTotal3.setText(nf.format(findOrder.getLineTotal(2)));
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Order Not Found");
        }
    }

    //Clears all existing orders
    private void clearOrders()
    {
        jz.clearOrders();
        resetForm();
        JOptionPane.showMessageDialog(null, "Orders Cleared!");
    }

    //Lists a short summary of all existing Orders
    private void printOrders()
    {
        String result = jz.getOrdersSummary();
        if (result.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "No Orders Available!");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, jz.getOrdersSummary());
        }
    }

    //Resets Textbox Fields
    public void resetForm() //done
    {
        txtOrderID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMemberShip.setText("");
        txtPhone.setText("");
        txtStreet.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZip.setText("");
        txtQty1.setText("");
        txtQty2.setText("");
        txtQty3.setText("");
        txtPrice1.setText("");
        txtPrice2.setText("");
        txtPrice3.setText("");
        txtLineTotal1.setText("");
        txtLineTotal2.setText("");
        txtLineTotal3.setText("");
        txtSubtotal.setText("");
        txtTax.setText("");
        txtTotal.setText("");

        try 
        {
            this.cboItem1.setSelectedIndex(-1);
            this.cboItem2.setSelectedIndex(-1);
            this.cboItem3.setSelectedIndex(-1);

        } 
        catch (Exception ex) 
        {
            //ignore error
        }
    }
    
    public void exportOrders()
    {
        //String fileName = JOptionPane.showInputDialog("Please Enter the Directory Path to Export Data");
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) 
        {   
            //Calls findOrder Method to input OrderID to export
            findOrder();
            String orderID = txtOrderID.getText();
            Order findOrder = jz.findOrder(orderID);

            try 
            {
                File file = fileChooser.getSelectedFile();
                FileWriter fWriter = new FileWriter(file);
                BufferedWriter bWriter = new BufferedWriter(fWriter);
                PrintWriter pw = new PrintWriter(bWriter);
                
                //Checks findOrder to see if Order exists then stores Data
                if (findOrder != null)
                {
                    //Get the values then assign it
                    String anOrderID = txtOrderID.getText();
                    String firstName = txtFirstName.getText();
                    String lastName = txtLastName.getText();
                    String phoneNum = txtPhone.getText();
                    String street = txtStreet.getText();
                    String city = txtCity.getText();
                    String state = txtState.getText();
                    String zip = txtZip.getText();
                    Object product1 = cboItem1.getSelectedItem();
                    Object product2 = cboItem2.getSelectedItem();
                    Object product3 = cboItem3.getSelectedItem();
                    String productQty1 = txtQty1.getText();
                    String productQty2 = txtQty2.getText();
                    String productQty3 = txtQty3.getText();
                    String price1 = txtPrice1.getText();
                    String price2 = txtPrice2.getText();
                    String price3 = txtPrice3.getText();
                    String lineTotal1 = txtLineTotal1.getText();
                    String lineTotal2 = txtLineTotal2.getText();
                    String lineTotal3 = txtLineTotal3.getText();
                    String subTotal = txtSubtotal.getText();
                    String tax = txtTax.getText();
                    String totalCost = txtTotal.getText();
                    String memberShip = txtMemberShip.getText();

                    //Print Data to Text File
                    pw.println("OrderID=" + anOrderID);
                    pw.println("firstName=" + firstName );
                    pw.println("lastName=" + lastName);
                    pw.println("MembershipID=" + memberShip);
                    pw.println("PhoneNumber=" + phoneNum);
                    pw.println("Address=" + street + ":" + city + ":" + state + ":" + zip);
                    pw.println("Product1/Quantity1/Price1/LineTotal1=" + product1 + ":" + productQty1 + ":" + price1 + ":" + lineTotal1);
                    pw.println("Product2/Quantity2/Price2/LineTotal2=" + product2 + ":" + productQty2 + ":" + price2 + ":" + lineTotal2);
                    pw.println("Product3/Quantity3/Price3/LineTotal3=" + product3 + ":" + productQty3 + ":" + price3 + ":" + lineTotal3);
                    pw.println("SubTotal=" + subTotal);
                    pw.println("Tax=" + tax);
                    pw.println("TotalCost=" + totalCost);

                    JOptionPane.showMessageDialog(null,"Export has been successfully executed");
                } 
                else
                {
                    JOptionPane.showMessageDialog(null, "Export failed");
                }
                pw.close();
                bWriter.close();
                fWriter.close();
            }
            catch(Exception ioEx)
            {
                JOptionPane.showMessageDialog(null, ioEx);
            } 
        }
    }
    
    public void importOrders()
    {
        //Select File to Import
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
        {
            File file = fileChooser.getSelectedFile();
            
            try
            {
                FileReader reader = new FileReader(file);
                BufferedReader buffer = new BufferedReader(reader);

                String fileInput = buffer.readLine();

                while(fileInput != null)
                {
                    String[] dataArray = fileInput.split("=|:");
                    String key = dataArray[0].toLowerCase();
                    if(key.equals("orderid"))
                    {
                        txtOrderID.setText(dataArray[1]);
                    }
                    else if(key.equals("firstname"))
                    {
                        txtFirstName.setText(dataArray[1]);
                    }
                    else if(key.equals("lastname"))
                    {
                        txtLastName.setText(dataArray[1]);
                    }
                    else if(key.equals("membershipid"))
                    {
                        txtMemberShip.setText(dataArray[1]);
                    }
                    else if(key.equals("phonenumber"))
                    {
                        txtPhone.setText(dataArray[1]);
                    }
                    else if(key.equals("address"))
                    {
                        txtStreet.setText(dataArray[1]);
                        txtCity.setText(dataArray[2]);
                        txtState.setText(dataArray[3]);
                        txtZip.setText(dataArray[4]);
                    }
                    else if(key.equals("product1/quantity1/price1/linetotal1"))
                    {
                        cboItem1.setSelectedItem(dataArray[1]);
                        txtQty1.setText(dataArray[2]);
                        txtPrice1.setText(dataArray[3]);
                        txtLineTotal1.setText(dataArray[4]);
                    }
                    else if(key.equals("product2/quantity2/price2/linetotal2"))
                    {
                        cboItem2.setSelectedItem(dataArray[1]);
                        txtQty2.setText(dataArray[2]);
                        txtPrice2.setText(dataArray[3]);
                        txtLineTotal2.setText(dataArray[4]);
                    }
                    else if(key.equals("product3/quantity3/price3/linetotal3"))
                    {
                        cboItem3.setSelectedItem(dataArray[1]);
                        txtQty3.setText(dataArray[2]);
                        txtPrice3.setText(dataArray[3]);
                        txtLineTotal3.setText(dataArray[4]);
                    }
                    else if(key.equals("subtotal"))
                    {
                        txtSubtotal.setText(dataArray[1]);
                    }
                    else if(key.equals("tax"))
                    {
                        txtTax.setText(dataArray[1]);
                    }
                    else if(key.equals("totalcost"))
                    {
                        txtTotal.setText(dataArray[1]);
                    }
                    fileInput = buffer.readLine();
                }

                reader.close();
                buffer.close();

                JOptionPane.showMessageDialog(null, "Data has been Imported successfully");
                addOrder();
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }
}
    
//@author Johnson
