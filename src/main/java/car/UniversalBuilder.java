package car;

import detail.*;

public class UniversalBuilder extends CarBuilder {

    @Override
    void buildBody() {
        car.setBody(new Body(50,"Кузов Универсала"));
    }

    @Override
    void buildControlGear() {
        car.setControlGear(new ControlGear(75,"Руль Универсала"));
    }

    @Override
    void buildEngine() {
        car.setEngine(new Engine(75,"Двигатель Универсала"));
    }

    @Override
    void buildPainting() {
        car.setPainting(new Painting(75,"Окраска Универсала"));
    }

    @Override
    void buildTransmission() {
        car.setTransmission(new Transmission(75,"Трансмиссия Универсала"));
    }

}
