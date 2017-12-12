package human;

/**
 * Employee class of the firm.
 */
public class Workman extends AbstractHuman implements WorkmanPrototype {

    private String experience;
    private String name;

    public Workman(String name, String experience) {
        super(name);
        this.experience=experience;
    }

    @Override
    public String toString() {
        return "Workman{" +
                "experience='" + experience + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * A prototype method that creates:
     * @return copy A copy of the worker.
     */
    @Override
    public Object createPrototype() {
        Workman copy = new Workman(name, experience);
        return copy;
    }

    public String getExperience() {
        return experience;
    }
}
