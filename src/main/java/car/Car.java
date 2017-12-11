package car;

import detail.*;
import java.util.HashMap;
import java.util.Map;

public class Car {

    private Map<String, AbstractDetail> details = new HashMap<>();

    public void addDetail(AbstractDetail detail) {
        details.put(detail.getDetailName(), detail);
    }

    public void removeDetail(String detailName) {
        details.remove(detailName);
    }

    public AbstractDetail getDetail(String detailName) {
        return details.get(detailName);
    }

    public Map<String, AbstractDetail> getAllDetails(){
        return details;
    }

    public void setBody(Body body) {
        addDetail(body);
    }

    public void setControlGear(ControlGear controlGear) {
        addDetail(controlGear);
    }

    public void setEngine(Engine engine) {
        addDetail(engine);
    }

    public void setPainting(Painting painting) {
        addDetail(painting);
    }

    public void setTransmission(Transmission transmission) {
        addDetail(transmission);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, AbstractDetail> entry : details.entrySet()) {
            stringBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
        }
        return stringBuilder.toString();
    }
}
