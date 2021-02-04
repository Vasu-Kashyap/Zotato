public class elite_cstmr extends reg_cstmr implements Customer
{

    public elite_cstmr(String name, String address) {
        super(name, address);
        this.setDeliverycharge(0);
        this.setType("(Elite)");
        this.setPremiumDiscount(50);
    }
}
