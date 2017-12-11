package human;

import car.Car;

public class Visitor extends AbstractHuman {

    Car car;
    private int money;
    private String name;

    public Visitor(String name, int money) {
        super(name);
        this.money=money;
    }

    public void setMoney(int money) {
        if (money >= 0)
            this.money = money;
    }

    public int getMoney() {
        return money;
    }


}
