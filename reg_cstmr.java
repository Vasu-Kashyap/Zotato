public class reg_cstmr implements Customer {

    private final String name;
    private String address;
    private double rewardpoints;
    private int deliverycharge;
    private double WalletBalance;
    private String type;
    private int premiumDiscount;

    public reg_cstmr(String name, String address)
    {
        this.name = name;
        this.address = address;
        this.rewardpoints = 0;
        this.deliverycharge = 40;
        this.WalletBalance = 1000;
        this.type= "(Normal)";
        this.premiumDiscount = 0;
    }

    @Override
    public String getName() {
        return name;
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
    public double getRewardpoints() {
        return rewardpoints;
    }

    @Override
    public void setRewardpoints(double rewardpoints,String x) {
        if (x.equals("add"))
        {this.rewardpoints += rewardpoints;}
        else if (x.equals("deduct"))
        {this.rewardpoints -= rewardpoints;}

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getDeliverycharge() {
        return deliverycharge;
    }

    @Override
    public void setDeliverycharge(int deliverycharge) {
        this.deliverycharge = deliverycharge;
    }

    @Override
    public double getWalletBalance() {
        return WalletBalance;
    }

    @Override
    public void setWalletBalance(double walletBalance) {
        this.WalletBalance -= walletBalance;
    }

    @Override
    public int getPremiumDiscount() {
        return premiumDiscount;
    }

    @Override
    public void setPremiumDiscount(int premiumDiscount) {
        this.premiumDiscount = premiumDiscount;
    }
}
