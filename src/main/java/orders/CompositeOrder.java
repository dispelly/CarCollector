package orders;

import car.Car;

import java.util.ArrayList;
import java.util.List;


public class CompositeOrder extends AbstractOrder implements Order {

    private List<Order> orderList = new ArrayList<>();

    public CompositeOrder(Car car, long priceForCar) {
        super(car,priceForCar);
    }

    public void addOrder(Order order1) {
        orderList.add(order1);
    }

    public void removeOrder(Order order1) {
        orderList.remove(order1);
    }

    public List<Order> getOrders() {
        return orderList;
    }

    @Override
    public void printOrderName() {
        for (Order order1 : orderList) {
            order1.printOrderName();
        }
    }
}
