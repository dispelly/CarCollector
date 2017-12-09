package orders;

import car.Car;

/**
 * @author VYZH
 * @since 30.11.2017
 */
public class CompletedOrder extends AbstractOrder implements Order {

    private Car car;
    private long price;

    public CompletedOrder(long priceForCar, long id) {
        super(priceForCar, id);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public void printOrderName() {
        System.out.println("Выполненный заказ на машину");
    }
}
