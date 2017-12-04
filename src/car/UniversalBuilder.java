package car;

import detail.*;

public class UniversalBuilder extends CarBuilder {

    @Override
    void buildBody() {
        car.setBody("Кузов Универсала");
    }

    @Override
    void buildControlGear() {
        car.setControlGear("Коробка пердач Универсала");
    }

    @Override
    void buildEngine() {
        car.setEngine("Двигатель Универсала");
    }

    @Override
    void buildPainting() {
        car.setPainting("Покраска Универсала");
    }

    @Override
    void buildTransmission() {
        car.setTransmission("Трансмиссия Универсала");
    }

}
