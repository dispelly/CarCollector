import car.Car;
import car.HatchbackBuilder;
import car.Director;
import car.SedanBuilder;

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
        Director directorH = new Director();
        directorH.setBuilder(new HatchbackBuilder());
        Car carH = directorH.BuildCar();
        System.out.println(carH);

        Director directorS = new Director();
        directorS.setBuilder(new SedanBuilder());
        Car carS = directorS.BuildCar();
        System.out.println(carS);

    }

/*
    Stock stock;

    public CompletedOrder doWork(ReplaceOrder ro) {
        Car car = ro.getCar();
        String detailName = ro.getDetailName();

        AbstractDetail oldDetail = car.removeDetail(detailName);
        AbstractDetail newDetail = stock.getDetailName(detailName);
        car.addDetail(newDetail);

        long balance = 0;
        balance += oldDetail.getDetailPrice();
        balance -= newDetail.getDetailPrice();

        return new CompletedOrder(car, balance);
    }
*/
}
