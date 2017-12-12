package stock;

import detail.*;

/**
 * Interface for interaction with the warehouse.
 */

public interface Stock {

    AbstractDetail getDetailFromStock(String detailName);

    void removeDetailFromStock(String detailName);

    void addDetailToStock(AbstractDetail detail);

    void templateAddCarDetailtoStock();

    void addFullHatchBacktoStock();

    void addFullSedantoStock();

    void addFullUniversaltoStock();

}
