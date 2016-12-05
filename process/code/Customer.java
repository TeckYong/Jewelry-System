
import java.util.ArrayList;

public class Customer {

    private static int custIDCounter = 0;

    private int customerID;
    private String custName;
    private String custIC;
    private String custPhoneNo;
    private String custAddress;

    public Customer() {
    }

    public Customer(int customerID, String custName, String custIC, String custPhoneNo, String custAddress) {
        this.customerID = customerID;
        this.custName = custName;
        this.custIC = custIC;
        this.custPhoneNo = custPhoneNo;
        this.custAddress = custAddress;
    }

    public Customer(String customerID, String custName, String custIC, String custPhoneNo, String custAddress) {
        this.customerID = custIDCounter++;
        this.custName = custName;
        this.custIC = custIC;
        this.custPhoneNo = custPhoneNo;
        this.custAddress = custAddress;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustIC() {
        return custIC;
    }

    public void setCustIC(String custIC) {
        this.custIC = custIC;
    }

    public String getCustPhoneNo() {
        return custPhoneNo;
    }

    public void setCustPhoneNo(String custPhoneNo) {
        this.custPhoneNo = custPhoneNo;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String toString() {
        return "Customer ID: " + customerID + "\n"
                + "Customer Name: " + custName + "\n"
                + "Customer IC: " + custIC + "\n"
                + "Customer Phone No: " + custPhoneNo + "\n"
                + "Customer Address: " + custAddress + "\n";
    }

    public static Customer findCustomer(int id) {
        Customer found = new Customer();
        for (int j = UJS.customers.size() - 1; j >= 0; j--) {
            if (UJS.customers.get(j).getCustomerID() == id) {
                found = UJS.customers.get(j);
                break;
            }
        }
        return found;
    }

}
