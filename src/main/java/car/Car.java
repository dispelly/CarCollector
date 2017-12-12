package car;
/**
 * A class that implements a particular machine.
 */
import detail.*;
import java.util.HashMap;
import java.util.Map;

public class Car {
    /**
     * @param details-Collection of machine parts.
     */
    private Map<String, AbstractDetail> details = new HashMap<>();
    /**
     * Adds a detail to the machine.
     * @param detail-The current part to add.
     */
    public void addDetail(AbstractDetail detail) {
        details.put(detail.getDetailName(), detail);
    }
    /**
     * Removes a part from the machine.
     * @param detailName-The current part for removal.
     */
    public void removeDetail(String detailName) {
        details.remove(detailName);
    }
    /**
     * Returns the item from the machine.
     * @param detailName-The current part for the request.
     */
    public AbstractDetail getDetail(String detailName) {
        return details.get(detailName);
    }
    /**
     * Returns all the details from the machine.
     * @return details-A collection of all the details.
     */
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
    /**
     * Prints a list of all the parts in the machine.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, AbstractDetail> entry : details.entrySet()) {
            stringBuilder.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
        }
        return stringBuilder.toString();
    }
}
