package orders;

import java.util.ArrayList;
import java.util.List;

/**
 * @author VYZH
 * @since 30.11.2017
 */
public class CompositeOrder extends AbstractOrder {

    private List<AbstractOrder> orders = new ArrayList<>();


    public CompositeOrder(int priceForCar, int id) {
        super(priceForCar, id);
    }

    public List<AbstractOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<AbstractOrder> orders) {
        this.orders = orders;
    }
}
