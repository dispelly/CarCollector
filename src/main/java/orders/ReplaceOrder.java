package orders;

import car.Car;

public class ReplaceOrder extends AbstractOrder implements Order{

    private Car car;
    private String detailName;
    private int numberOfDetails;

    public ReplaceOrder(Car car,long priceForCar) {
        super(car,priceForCar);
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getDetailName() {
        return detailName;
    }

    @Override
    public void printOrderName() {
        System.out.println("Заказ на замену частей в машине");
    }

}
