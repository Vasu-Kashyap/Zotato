import java.util.ArrayList;

public interface Restaurant {
    public String getName();
    public double getRewardPoints();
    public ArrayList<fooditem> getMenu();
    public String getAddress();
    public int getTotalOrders();
    public String getType();
    public void setRewardPoints(double rewardPoints);
    public void addMenu(fooditem x);
    public void setAddress(String address);
    public void addTotalOrders();
    public int getDiscountOnBill();
    public void setDiscountOnBill(int discountOnBill);
    public int getReward();
    public void setReward(int reward);
    public void setTotalOrders();


}
