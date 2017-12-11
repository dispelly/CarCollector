import detail.*;
import orders.*;
import stock.*;
import car.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Director directorH = new Director();
        directorH.setBuilder(new HatchbackBuilder());
        Car carH = directorH.BuildCar();
        // System.out.println(carH);

        Director directorS = new Director();
        directorS.setBuilder(new SedanBuilder());
        Car carS = directorS.BuildCar();
        //System.out.println(carS);

        Stock stock = new DetailStock();
        System.out.println(stock.toString());



    }


}
