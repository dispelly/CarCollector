package Human;

public class Workman extends AbstractHuman {
    private String experience;


    public Workman(String name, int money,String experience) {
        super(name, money);
        this.experience=experience;
    }

    public String getExperience() {
        return experience;
    }
}
