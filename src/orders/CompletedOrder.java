package orders;

import car.AbstractCar;

/**
 * @author VYZH
 * @since 30.11.2017
 */
public class CompletedOrder extends AbstractOrder implements Order{

    private AbstractCar car;
    private long price;

    public CompletedOrder(long priceForCar, long id) {
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

    @Override
    public void getOrderName() {
        System.out.println("Выполненный заказ на машину");
    }
}
