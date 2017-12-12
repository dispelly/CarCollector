package human;

/**
 * Abstract class of people.
 */
public abstract class AbstractHuman {

    private String name;

    public AbstractHuman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Set the name with a blank check.
     * @param name - The name of the current person.
     */
    public void setName(String name) {
        try {
            if (name != null)
                this.name = name;
        }catch (IllegalArgumentException e){
            System.out.println("Name can not be empty");}

    }


}
