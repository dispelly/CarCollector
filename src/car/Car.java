package car;

import detail.*;

public class Car {
    String body;
    String controlGear;
    String engine;
    String painting;
    String transmission;

    public void setBody(String body) {
        this.body = body;
    }

    public void setControlGear(String controlGear) {
        this.controlGear = controlGear;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setPainting(String painting) {
        this.painting = painting;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", controlGear=" + controlGear +
                ", engine=" + engine +
                ", painting=" + painting +
                ", transmission=" + transmission +
                '}';
    }
}
