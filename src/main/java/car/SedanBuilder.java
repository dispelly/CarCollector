package car;

import detail.*;
/**
 * A class for creating a Sedan car with the specified details and their price.
 */
public class SedanBuilder extends CarBuilder {

    @Override
    void buildBody() {
        car.setBody(new Body(40,"Кузов Седана"));
    }

    @Override
    void buildControlGear() {
        car.setControlGear(new ControlGear(65,"Руль Седана"));
    }

    @Override
    void buildEngine() {
        car.setEngine(new Engine(100,"Двигатель Седана"));
    }

    @Override
    void buildPainting() {
        car.setPainting(new Painting(80,"Окраска Седана"));
    }

    @Override
    void buildTransmission() {
        car.setTransmission(new Transmission(110,"Трансмиссия Седана"));
    }

}
