package stock;

import detail.*;


public interface Stock {
    AbstractDetail getDetailFromStock(String detailName);
    void removeDetailFromStock(String detailName);
    void addDetailToStock(AbstractDetail detail);


    void addBody(Body body);

    void addControlGear(ControlGear controlGear);

    void addEngine(Engine engine);

    void addPainting(Painting painting);

    void addTransmission(Transmission transmission);


}
