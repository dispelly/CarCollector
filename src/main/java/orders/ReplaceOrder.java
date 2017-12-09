package orders;

import car.Car;

public class ReplaceOrder extends AbstractOrder implements Order{

    private Car car;
    private String detailName;
    private int numberOfDetails;

    public ReplaceOrder(int priceForCar, int id, int numberOfDetails) {
        super(priceForCar, id);
        this.numberOfDetails = numberOfDetails;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
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
    public void printOrderName() {
        System.out.println("Заказ на замену частей в машине");
    }

}
