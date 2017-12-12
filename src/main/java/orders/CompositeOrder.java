package orders;

import car.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that implements the list of orders and a composite template.
 */
public class CompositeOrder extends AbstractOrder implements Order {

    /**
     * orderList - list of all orders.
     */
    private List<Order> orderList = new ArrayList<>();

    public CompositeOrder(Car car, long priceForCar) {
        super(car,priceForCar);
    }

    /**
     * Creates a new order:
     */
    public void addOrder(Order order1) {
        orderList.add(order1);
    }
    /**
     * Deletes an order:
     */
    public void removeOrder(Order order1) {
        orderList.remove(order1);
    }
    /**
     * Returns the list of orders.
     * @return orderList
     */
    public List<Order> getOrders() {
        return orderList;
    }

    /**
     * Prints the entire list of orders.
     */
    @Override
    public void printOrderName() {
        for (Order order1 : orderList) {
            order1.printOrderName();
        }
    }
}
