package Orders;

public class ReplaceOrder extends AbstractOrder {
    private int numberOfDetails;

    public ReplaceOrder(int priceForCar, int id, int numberOfDetails) {
        super(priceForCar, id);
        this.numberOfDetails = numberOfDetails;
    }


}
