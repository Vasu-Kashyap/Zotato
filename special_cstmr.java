public class special_cstmr extends reg_cstmr implements Customer
{

    public special_cstmr(String name, String address) {
        super(name, address);
        this.setDeliverycharge(20);
        this.setType("(Special)");
        this.setPremiumDiscount(25);
    }
}
