import java.util.ArrayList;

public class Regular_restro implements Restaurant  {

    private final String name;
    private double rewardPoints;
    private ArrayList<fooditem> menu;
    private String address;
    private int totalOrders;
    private String type;
    private int discountOnBill;
    private int reward;

    public Regular_restro(String name, String address)
    {
        this.name = name;
        this.rewardPoints = 0;
        this.address = address;
        this.totalOrders=0;
        this.type = "";
        this.discountOnBill = 0;
        this.menu = new ArrayList<fooditem>();
        this.reward = 20;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRewardPoints() {
        return rewardPoints;
    }

    @Override
    public void setRewardPoints(double rewardPoints) {
        this.rewardPoints += rewardPoints;
    }

    @Override
    public ArrayList<fooditem> getMenu() {
        return menu;
    }

    @Override
    public void addMenu(fooditem x) {
        this.menu.add(x);
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getTotalOrders() {
        return totalOrders;
    }

    @Override
    public void setTotalOrders() {
        this.totalOrders += totalOrders;
    }

    @Override
    public void addTotalOrders() {
        this.totalOrders += 1;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getDiscountOnBill() {
        return discountOnBill;
    }
    @Override
    public void setDiscountOnBill(int discountOnBill) {
        this.discountOnBill = discountOnBill;
    }

    @Override
    public int getReward() {
        return reward;
    }

    @Override
    public void setReward(int reward) {
        this.reward = reward;
    }
}

