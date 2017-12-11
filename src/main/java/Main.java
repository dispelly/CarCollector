import detail.*;
import orders.*;
import stock.*;
import car.*;

public class Main {

    /*
     * Order -> Station
     * Order contains list of details
     * Station check list of details for availability in stock.Stock, stock.Stock return details
     *
     * stock.Stock removes returned details from internal list
     *
     *
     */
    public static void main(String[] args) throws Exception{
        Director directorH = new Director();
        directorH.setBuilder(new HatchbackBuilder());
        Car carH = directorH.BuildCar();
        System.out.println(carH);

        Director directorS = new Director();
        directorS.setBuilder(new SedanBuilder());
        Car carS = directorS.BuildCar();
        System.out.println(carS);

    }


    Stock stock;

    public CompletedOrder doReplace(ReplaceOrder ro) throws Exception {
        Car car = ro.getCar();
        String detailName = ro.getDetailName();
        int price=0;
        AbstractDetail oldDetail = car.getDetail(detailName);

        car.removeDetail(detailName);
        AbstractDetail newDetail = stock.getDetailFromStock(detailName);
        car.addDetail(newDetail);
        stock.removeDetailFromStock(detailName);
        price = newDetail.getDetailPrice();

        return new CompletedOrder(car, price);
    }

    public CompletedOrder doDisassemble(DisassembleOrder ro) throws Exception {
        Car car = ro.getCar();
        String detailName = ro.getDetailName();
        int price=0;


        return new CompletedOrder(car, price);
    }




}
