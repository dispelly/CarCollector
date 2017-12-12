package stock;

import car.Car;
import detail.*;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;

/**
 * Class for storing parts after parsing machines.
 */
public class DetailStock implements Stock {
    /**
     * @param stockDetails - A collection of parts in a warehouse.
     */
    private Map<String, AbstractDetail> stockDetails = new HashMap<>();

    /**
     * Adds a detail to the warehouse.
     */

    public void addDetailToStock(AbstractDetail detail) {
        stockDetails.put(detail.getDetailName(), detail);
    }

    /**
     * Removes a part from the warehouse.
     */
    public void removeDetailFromStock(String detailName) {
        stockDetails.remove(detailName);
    }

    /**
     * @param detailName - The name of the detail on which the search is in the warehouse.
     * @return AbstractDetail - a certain detail from the list.
     */
    public AbstractDetail getDetailFromStock(String detailName) {
        return stockDetails.get(detailName);
    }

    /**
     * Adds all the details of 3 cars to the warehouse. Can be used as a template method.
     */
    public void templateAddCarDetailtoStock() {
        addFullHatchBacktoStock();
        addFullSedantoStock();
        addFullUniversaltoStock();
    }

    /**
     * Adds all the details of the hatchback to the warehouse.
     */
    public void addFullHatchBacktoStock() {
        addDetailToStock(new Body(50, "Кузов Хэтчбека"));
        addDetailToStock(new ControlGear(75, "Руль Хэтчбека"));
        addDetailToStock(new Engine(100, "Двигатель Хэтчбека"));
        addDetailToStock(new Painting(80, "Окраска Хэтчбека"));
        addDetailToStock(new Transmission(60, "Трансмиссия Хэтчбека"));
    }

    /**
     * Adds all the details of the Sedan to the warehouse.
     */
    public void addFullSedantoStock() {
        addDetailToStock(new Body(60, "Кузов Седана"));
        addDetailToStock(new ControlGear(80, "Руль Седана"));
        addDetailToStock(new Engine(55, "Двигатель Седана"));
        addDetailToStock(new Painting(110, "Окраска Седана"));
        addDetailToStock(new Transmission(35, "Трансмиссия Седана"));
    }

    /**
     * Adds all the details of the Universal to the warehouse.
     */
    public void addFullUniversaltoStock() {
        addDetailToStock(new Body(45, "Кузов Универсала"));
        addDetailToStock(new ControlGear(85, "Руль Универсала"));
        addDetailToStock(new Engine(120, "Двигатель Универсала"));
        addDetailToStock(new Painting(35, "Окраска Универсала"));
        addDetailToStock(new Transmission(75, "Трансмиссия Универсала"));
    }

    /**
     * @return A complete list of details in a convenient text format.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, AbstractDetail> entry : stockDetails.entrySet()) {
            stringBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
        }
        return stringBuilder.toString();
    }

}
