package orders;

import car.Car;
import detail.AbstractDetail;

/**
 * Class for parsing the machine for parts.
 */
public class DisassembleOrder extends AbstractOrder implements Order {

    private Car car;
    private String detailName;


    public DisassembleOrder (Car car, long priceForCar) {
        super(car,priceForCar);
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
    /**
     * Order for dismantling the machine
     */
    @Override
    public void printOrderName() {
        System.out.println("Заказ на разборку машины");
    }
}
