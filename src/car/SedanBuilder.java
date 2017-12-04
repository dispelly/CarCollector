package car;

import detail.*;

public class SedanBuilder extends CarBuilder {

    @Override
    void buildBody() {
        car.setBody("Кузов Седана");
    }

    @Override
    void buildControlGear() {
        car.setControlGear("Коробка передач Седана");
    }

    @Override
    void buildEngine() {
        car.setEngine("Двигатель Седана");
    }

    @Override
    void buildPainting() {
        car.setPainting("Покраска Седана");
    }

    @Override
    void buildTransmission() {
        car.setTransmission("Трансмиссия Седана");
    }

}
