package stock;

import car.Car;
import detail.*;

import java.util.HashMap;
import java.util.Map;

public class DetailStock implements Stock {

    private Map<String, AbstractDetail> stockDetails = new HashMap<>();


    public void addDetailToStock(AbstractDetail detail) {
        stockDetails.put(detail.getDetailName(), detail);
    }

    public void removeDetailFromStock(String detailName) {
        stockDetails.remove(detailName);
    }

    public AbstractDetail getDetailFromStock(String detailName) {
        return stockDetails.get(detailName);
    }
    public void addBody(Body body) {
        addDetailToStock(body);
    }

    public void addControlGear(ControlGear controlGear) {
        addDetailToStock(controlGear);
    }

    public void addEngine(Engine engine) {
        addDetailToStock(engine);
    }

    public void addPainting(Painting painting) {
        addDetailToStock(painting);
    }

    public void addTransmission(Transmission transmission) {
        addDetailToStock(transmission);
    }


}
