package human;

import car.Car;

/**
 * A client class with a machine for work.
 */
public class Visitor extends AbstractHuman {

    Car car;
    private int money;
    private String name;

    public Visitor(String name, int money) {
        super(name);
        this.money=money;
    }

    /**
     * Setting the quantity:
     * @param money - money.
     */
    public void setMoney(int money) {
        try {
            if (money >= 0)
                this.money = money;

        } catch (IllegalArgumentException e) {
            System.out.println("Money can not be less than 0");
        }
    }


    public int getMoney() {
        return money;
    }


}
