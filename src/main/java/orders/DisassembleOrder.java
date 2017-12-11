package orders;

import car.Car;
import detail.AbstractDetail;

public class DisassembleOrder extends AbstractOrder implements Order {
    private Car car;
    private String detailName;


    public DisassembleOrder (Car car, long priceForCar) {
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

    public AbstractDetail getDetail(String detailName){
        return car.getDetail(detailName);
    }

    @Override
    public void printOrderName() {
        System.out.println("Заказ на разборку машины");
    }
}
