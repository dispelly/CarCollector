package car;

public abstract class CarBuilder {

    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildBody();

    abstract void buildControlGear();

    abstract void buildEngine();

    abstract void buildPainting();

    abstract void buildTransmission();

    Car getCar() {
        return car;
    }
}
