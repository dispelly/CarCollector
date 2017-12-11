package stock;

import car.Car;
import detail.*;

import java.util.HashMap;
import java.util.Map;

public class DetailStock extends Car implements Stock {

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

    public void templateAddCarDetailtoStock(){
        addFullHatchBacktoStock();
        addFullSedantoStock();
        addFullUniversaltoStock();
    }


    public void addFullHatchBacktoStock() {
        addDetailToStock(new Body(50, "Кузов Хэтчбека"));
        addDetailToStock(new ControlGear(75, "Руль Хэтчбека"));
        addDetailToStock(new Engine(100, "Двигатель Хэтчбека"));
        addDetailToStock(new Painting(80, "Окраска Хэтчбека"));
        addDetailToStock(new Transmission(60, "Трансмиссия Хэтчбека"));
    }

    public void addFullSedantoStock() {
        addDetailToStock(new Body(60, "Кузов Седана"));
        addDetailToStock(new ControlGear(80, "Руль Седана"));
        addDetailToStock(new Engine(55, "Двигатель Седана"));
        addDetailToStock(new Painting(110, "Окраска Седана"));
        addDetailToStock(new Transmission(35, "Трансмиссия Седана"));
    }

    public void addFullUniversaltoStock() {
        addDetailToStock(new Body(45, "Кузов Универсала"));
        addDetailToStock(new ControlGear(85, "Руль Универсала"));
        addDetailToStock(new Engine(120, "Двигатель Универсала"));
        addDetailToStock(new Painting(35, "Окраска Универсала"));
        addDetailToStock(new Transmission(75, "Трансмиссия Универсала"));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, AbstractDetail> entry : stockDetails.entrySet()) {
            stringBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
        }
        return stringBuilder.toString();
    }

}
