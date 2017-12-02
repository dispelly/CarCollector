package orders;

import car.AbstractCar;

/**
 * @author VYZH
 * @since 30.11.2017
 */
public class CompletedOrder extends AbstractOrder {

    private AbstractCar car;
    private long price;

    public CompletedOrder(AbstractCar priceForCar, long id) {
        super(priceForCar, id);
    }

    public AbstractCar getCar() {
        return car;
    }

    public void setCar(AbstractCar car) {
        this.car = car;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
