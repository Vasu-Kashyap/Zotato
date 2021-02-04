public class fastfood_restro extends Regular_restro
{

    public fastfood_restro(String name, String address) {
        super(name, address);

        this.setDiscountOnBill(0);
        this.setType("(Fast Food)");
        this.setReward(15);
    }

}
