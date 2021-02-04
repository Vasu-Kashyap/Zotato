import java.util.ArrayList;

public class Company {
    private double accountBalance;
    private float deliveryCharge;
    private String name;

    private ArrayList<Restaurant> restro_arr;
    private ArrayList<Customer> Customer_arr;

    public Company(String name)
    {
        this.accountBalance =0;
        this.deliveryCharge =0;
        this.name=name;
        this.restro_arr = new ArrayList<Restaurant>();
        this.Customer_arr = new ArrayList<Customer>();
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void addAccountBalance(double amount) {
        this.accountBalance += amount;
    }

    public float getDeliveryCharge() {
        return deliveryCharge;
    }

    public void addDeliverycharge(float deliverycharge) {
        this.deliveryCharge += deliverycharge;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Restaurant> getRestro_arr() {
        return restro_arr;
    }

    public void addRestro_arr(Restaurant x) {
        this.restro_arr.add(x);
    }

    public ArrayList<Customer> getCustomer_arr() {
        return Customer_arr;
    }

    public void addCustomer_arr(Customer x) {
        this.Customer_arr.add(x);
    }
}
