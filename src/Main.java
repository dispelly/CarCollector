import car.AbstractCar;
import detail.AbstractDetail;
import orders.CompletedOrder;
import orders.ReplaceOrder;

public class Main {

    /*
     * Order -> Station
     * Order contains list of details
     * Station check list of details for availability in Stock, Stock return details
     *
     * Stock removes returned details from internal list
     *
     *
     */
    public static void main(String[] args) {
	// write your code here
    }


    Stock stock;

    public CompletedOrder doWork(ReplaceOrder ro) {
        AbstractCar car = ro.getCar();
        String detailName = ro.getDetailName();

        AbstractDetail oldDetail = car.removeDetail(detailName);
        AbstractDetail newDetail = stock.getDetail(detailName);
        car.addDetail(newDetail);

        long balance = 0;
        balance += oldDetail.getDetailPrice();
        balance -= newDetail.getDetailPrice();

        return new CompletedOrder(balance, balance);
    }

}
