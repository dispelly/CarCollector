package orders;

public abstract class AbstractOrder {
    private long priceForCar;
    private long id;

    public AbstractOrder(long priceForCar, long id) {
        this.priceForCar = priceForCar;
        this.id = id;
    }
}
