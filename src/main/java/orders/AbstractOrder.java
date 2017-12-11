package orders;

import car.*;

public abstract class AbstractOrder {

    private long priceForCar;
    private Car car;

    public AbstractOrder(Car car, long priceForCar) {
        this.car = car;
        this.priceForCar = priceForCar;
    }
    public AbstractOrder(long priceForCar) {

        this.priceForCar = priceForCar;
    }

    public Car getCar() {
        return this.car;
    }

}
