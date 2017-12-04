package car;

import detail.*;

public class HatchbackBuilder extends CarBuilder {

    @Override
    void buildBody() {
        car.setBody("Кузов Хэтчбэка");
    }

    @Override
    void buildControlGear() {
        car.setControlGear("Коробка передач Хэтчбэка");
    }

    @Override
    void buildEngine() {
        car.setEngine("Двигатель Хэтчбэка");
    }

    @Override
    void buildPainting() {
        car.setPainting("Покраска Хэтчбэка");
    }

    @Override
    void buildTransmission() {
        car.setTransmission("Трансмиссия Хэтчбэка");
    }


}
