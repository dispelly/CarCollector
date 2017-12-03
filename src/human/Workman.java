package human;

public class Workman extends AbstractHuman implements WorkmanPrototype{
    private String experience;
    private String name;

    public Workman(String name, String experience) {
        super(name, experience);
        this.experience=experience;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Workman{" +
                "experience='" + experience + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object createPrototype() {
        Workman copy=new Workman(name,experience);
        return copy;
    }

    public String getExperience() {
        return experience;
    }
}
