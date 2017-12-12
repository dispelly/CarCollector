package car;

import car.*;
/**
 * The class manager for the template is the creator of the machines.
 */
public class Director {

    CarBuilder builder;

    public void setBuilder(CarBuilder b) {
        builder = b;
    }

    public Car BuildCar() {
        builder.createCar();
        builder.buildBody();
        builder.buildControlGear();
        builder.buildEngine();
        builder.buildPainting();
        builder.buildTransmission();
        Car car = builder.getCar();
        return car;
    }
}
