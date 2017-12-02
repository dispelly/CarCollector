package car;

import detail.AbstractDetail;

public abstract class AbstractCar {
    private String model;
    private int detailNumber;

    public AbstractCar(String model, int detailNumber) {
        this.model = model;
        this.detailNumber = detailNumber;
    }

    public AbstractDetail removeDetail(String detailName) {
        return null;
    }

    public void addDetail(AbstractDetail newDetail) {

    }
}
