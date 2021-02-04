public class authentic_restro extends Regular_restro
{
    private int discountOnBill;

    public authentic_restro(String name, String address) {
        super(name, address);
        this.discountOnBill = 0;
        this.setType("(Authentic)");
        this.setReward(8);
    }

    public int getDiscountOnBill() {
        return discountOnBill;
    }

    public void setDiscountOnBill(int discountOnBill) {
        this.discountOnBill = discountOnBill;
    }
}
