package orders;

import car.AbstractCar;

public class ReplaceOrder extends AbstractOrder implements Order{

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

    @Override
    public void getOrderName() {
        System.out.println("Заказ на замену частей в машине");
    }

}