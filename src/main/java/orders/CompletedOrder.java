package orders;

import car.Car;
import detail.AbstractDetail;
import stock.Stock;

import java.util.Map;

public class CompletedOrder extends AbstractOrder implements Order {

    private Car car;
    private long price;

    public CompletedOrder(Car car, long priceForCar) {
        super(car, priceForCar);
    }
    public CompletedOrder(long priceForCar) {
        super(priceForCar);
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

    Stock stock;

    public CompletedOrder doReplace(ReplaceOrder ro) throws Exception {
        Car car = ro.getCar();
        String detailName = ro.getDetailName();
        long price = 0;

        car.removeDetail(detailName);
        AbstractDetail newDetail = stock.getDetailFromStock(detailName);
        car.addDetail(newDetail);
        stock.removeDetailFromStock(detailName);
        price = newDetail.getDetailPrice();

        return new CompletedOrder(car, price);
    }

    public CompletedOrder doDisassemble(DisassembleOrder ro) throws Exception {
        Car car = ro.getCar();
        long price=0;
        Map<String, AbstractDetail> newdetails = car.getAllDetails();
        for (Map.Entry<String, AbstractDetail> entry : newdetails.entrySet()) {
               price+=entry.getValue().getDetailPrice();
               stock.addDetailToStock(entry.getValue());
        }

        return new CompletedOrder(price);
    }
}
