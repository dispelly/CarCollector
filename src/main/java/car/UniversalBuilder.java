package car;

import detail.*;
/**
 * Class to create a car Universal with a set of details and their price.
 */
public class UniversalBuilder extends CarBuilder {

    @Override
    void buildBody() {
        car.setBody(new Body(70,"Кузов Универсала"));
    }

    @Override
    void buildControlGear() {
        car.setControlGear(new ControlGear(100,"Руль Универсала"));
    }

    @Override
    void buildEngine() {
        car.setEngine(new Engine(40,"Двигатель Универсала"));
    }

    @Override
    void buildPainting() {
        car.setPainting(new Painting(55,"Окраска Универсала"));
    }

    @Override
    void buildTransmission() {
        car.setTransmission(new Transmission(45,"Трансмиссия Универсала"));
    }

}
