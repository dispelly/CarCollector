package orders;

import car.Car;
import detail.AbstractDetail;
import stock.Stock;

public class ReplaceOrder extends AbstractOrder implements Order{

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

    @Override
    public void printOrderName() {
        System.out.println("Заказ на замену частей в машине");
    }


}
