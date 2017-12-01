package Orders;

import Car.AbstractCar;
import Detail.AbstractDetail;

public class ReplaceOrder extends AbstractOrder {

    private AbstractCar car;
    private String detailName;
    private int numberOfDetails;

    public ReplaceOrder(int priceForCar, int id, int numberOfDetails) {
        super(priceForCar, id);
        this.numberOfDetails = numberOfDetails;
    }


    public AbstractCar getCar() {
        return car;
    }

    public void setCar(AbstractCar car) {
        this.car = car;
    }

    public int getNumberOfDetails() {
        return numberOfDetails;
    }

    public void setNumberOfDetails(int numberOfDetails) {
        this.numberOfDetails = numberOfDetails;
    }

    public String getDetailName() {
        return detailName;
    }
}
