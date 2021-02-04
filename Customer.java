public interface Customer {
    public String getName();
    public String getAddress();
    public double getRewardpoints();
    public int getDeliverycharge();
    public double getWalletBalance();
    public String getType();
    public void setType(String type);
    public void setAddress(String address);
    public void setDeliverycharge(int deliverycharge);
    public void setWalletBalance(double walletBalance);
    public void setRewardpoints(double rewardpoints,String x);
    public int getPremiumDiscount();
    public void setPremiumDiscount(int premiumDiscount);


}
