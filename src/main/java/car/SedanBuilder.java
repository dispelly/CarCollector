package car;

import detail.*;

public class SedanBuilder extends CarBuilder {

    @Override
    void buildBody() {
        car.setBody(new Body(50,"Кузов Седана"));
    }

    @Override
    void buildControlGear() {
        car.setControlGear(new ControlGear(75,"Руль Седана"));
    }

    @Override
    void buildEngine() {
        car.setEngine(new Engine(75,"Двигатель Седана"));
    }

    @Override
    void buildPainting() {
        car.setPainting(new Painting(75,"Окраска Седана"));
    }

    @Override
    void buildTransmission() {
        car.setTransmission(new Transmission(75,"Трансмиссия Седана"));
    }

}
