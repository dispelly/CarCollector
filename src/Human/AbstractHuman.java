package Human;

public class AbstractHuman {
    private String name;
    private int money;

    public AbstractHuman(String name,int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        if(name!=null)
        this.name = name;
    }

    public void setMoney(int money) {
        if(money>=0)
        this.money = money;
    }
}
