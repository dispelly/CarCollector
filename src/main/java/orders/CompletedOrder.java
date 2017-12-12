package orders;

import car.Car;
import detail.AbstractDetail;
import stock.DetailStock;
import stock.Stock;

import java.util.Map;
import java.util.MissingResourceException;

/**
 * A class that transfers the current order to the completed one.
 */
public class CompletedOrder extends AbstractOrder implements Order {
    /**
     * @param price - The amount of money for work.
     * @param car - The current machine for processing.
     */
    private Car car;
    private long price;

    /**
     * Constructors for 2 types of orders for parsing and for replacement parts.
     */
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
    /**
     * Prints the order type.
     */
    @Override
    public void printOrderName() {
        System.out.println("Completed order for the machine");
    }

    Stock stock=new DetailStock();

    /**
     * The method that transfers the replacement order to the completed order.
     * @param ro - Order for replacement parts.
     * @return A ready car and an account.
     * @throws Exception In the absence of a part in the warehouse.
     */
    public CompletedOrder doReplace(ReplaceOrder ro) throws Exception {

        Car car = ro.getCar();
        String detailName = ro.getDetailName();
        long price = 0;
        /**
         * Replaces the spare part for a similar in stock.
         */
        car.removeDetail(detailName);
        AbstractDetail newDetail = null;
        try {
            newDetail=stock.getDetailFromStock(detailName);
        } catch (MissingResourceException e){
            System.out.println("No items in stock");
        }
        car.addDetail(newDetail);
        stock.removeDetailFromStock(detailName);
        price = newDetail.getDetailPrice();

        return new CompletedOrder(car, price);
    }
    /**
     * The method that transfers the order for parsing into the executed order.
     * @param ro - Order for parsing the machine.
     * @return The bill for work.
     */
    public CompletedOrder doDisassemble(DisassembleOrder ro) throws Exception {
        Car car = ro.getCar();
        long price=0;
        /**
         * @param newdetails It contains all parts of the current machine for transfer to the warehouse.
         */
        Map<String, AbstractDetail> newdetails = car.getAllDetails();
        for (Map.Entry<String, AbstractDetail> entry : newdetails.entrySet()) {
               price+=entry.getValue().getDetailPrice();
               stock.addDetailToStock(entry.getValue());
        }

        return new CompletedOrder(price);
    }
}
