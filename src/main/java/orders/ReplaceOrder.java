package orders;

import car.Car;
import detail.AbstractDetail;
import stock.Stock;

/**
 * The class of the order for replacement of parts.
 */
public class ReplaceOrder extends AbstractOrder implements Order{
    /**
     * @param detailName Part name for replacement
     *
     */
    private Car car;
    private String detailName;
    private long priceForCar;

    public ReplaceOrder(Car car,long priceForCar,String detailName) {
        super(car,priceForCar);
        this.detailName=detailName;
    }


    public void setCar(Car car) {
        this.car = car;
    }

    public String getDetailName() {
        return detailName;
    }

    /**
     * Prints the order type.
     */
    @Override
    public void printOrderName() {
        System.out.println("Order for replacement parts in the car");
    }


}
