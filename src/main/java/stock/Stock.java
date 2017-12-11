package stock;

import detail.*;

public interface Stock {

    AbstractDetail getDetailFromStock(String detailName);

    void removeDetailFromStock(String detailName);

    void addDetailToStock(AbstractDetail detail);

    void templateAddCarDetailtoStock();

    void addFullHatchBacktoStock();

    void addFullSedantoStock();

    public void addFullUniversaltoStock();

}
