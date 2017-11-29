package Orders;

public class AbstractOrder {
    private int priceForCar;
    private int id;

    public AbstractOrder(int priceForCar, int id) {
        this.priceForCar = priceForCar;
        this.id = id;
    }
}
