package car;

import detail.*;
/**
 * A class for building a Hatchback car with specified details and their price.
 */
public class HatchbackBuilder extends CarBuilder {

    @Override
    void buildBody() {
        car.setBody(new Body(50,"Кузов Хэтчбека"));
    }

    @Override
    void buildControlGear() {
        car.setControlGear(new ControlGear(75,"Руль Хэтчбека"));
    }

    @Override
    void buildEngine() {
        car.setEngine(new Engine(100,"Двигатель Хэтчбека"));
    }

    @Override
    void buildPainting() {
        car.setPainting(new Painting(80,"Окраска Хэтчбека"));
    }

    @Override
    void buildTransmission() {
        car.setTransmission(new Transmission(60,"Трансмиссия Хэтчбека"));
    }


}
